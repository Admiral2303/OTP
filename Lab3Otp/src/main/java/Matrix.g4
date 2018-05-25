grammar Matrix;

/*
 * Parser Rules
 */

root:
     input EOF                              # RootRule
;


input:
    assignment                              # ToSetVariable
    | sum NL? EOF                           # ExecuteExpression
;

assignment:
	VAR EQUAL input                         # MakeAssignment
;


sum:
    sum PLUS inverse                       # MakePlus
    | inverse                              # ToInverse
;
inverse:
    inverse INVERSE                     # MakeInverse
    | determinant                      # ToDeterminant
;

determinant:
       DETERMINANT determinant                # MakeDeterminant
      | atom                                     # ToAtom
;


//sum:
//    sum PLUS determinant                       # MakePlus
//    | determinant                              # ToDeterminant
//;
//
//determinant:
//       DETERMINANT inverse                # MakeDeterminant
//      | inverse                                     # ToInverse
//;
//inverse:
//    inverse INVERSE             # MakeInverse
//    | atom                      # ToAtom
//;


//sum:
//    sum PLUS delete                       # MakePlus
//    | delete                              # ToDelete
//;


//delete:
//    delete DELETE multiple                  # MakeDelete
//    | multiple                              # MakeMultiply
//    ;
//
//multiple:
//    multiple  MULTIPLE  transpose           # MakeMultiple
//    | transpose                             # ToTranspose
//;
//
//transpose:
//    transpose TRANSPOSE                     # MakeTranspose
//    | atom                                  # ToAtom
//;

atom:
    NUMBER                                  # MakeNumber
    | MATRIX                                # MakeMatrix
    | VAR                                   # Variable
    | LB sum RB                                        # MakeBraces
    //| LB sum RB                             # MakeBraces
;


// Variable
VAR : [a-cA-C_][a-zA-Z_0-9]*;

// Values

NUMBER : '-'?([0-9]+ | [0-9]+'.'[0-9]+);
VECTOR : '['NUMBER(','WHITESPACE* NUMBER)*']' ;
MATRIX : '['VECTOR(','WHITESPACE* VECTOR)*']' ;

// Symbols

EQUAL : '=';
WHITESPACE : [ \n\t\r]+ -> skip;
LB: '(';
RB: ')';
NL: '\n';

// Operation symbols

PLUS : '+';
MULTIPLE: '*';
TRANSPOSE: '^T';
DELETE: '/';
INVERSE: '^-1';
DETERMINANT: 'det';