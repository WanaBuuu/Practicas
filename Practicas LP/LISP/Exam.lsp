(defun producto_lista (l)
	(if (null l) 1 (* (car l) (producto_lista (cdr l))))
)

(defun borrar_n_esimo(l n)
	(cond
		((null l) nil)
		((equal n 1) (cdr l))
		(T (cons (car l) (borrar_n_esimo (cdr l) (1- n))))
	)
)

(defun aplanar (l)
	(cond
		((NULL l) nil)
		((atom (car l)) (cons (car l)(aplanar (cdr l))))
		(T (append (aplanar (car l)) (aplanar (cdr l))))
	)
)

(defun aplicar (f n)
	(cond
		((< n 1) 0)
		(T (+ (funcall f n) (aplicar f (1- n))))
	)
)

; Funciones auxiliares para usar 
(defun sumarUno(n) (1+ n))
(defun dejarIgual(n) (1+ (1- n)))

(defun mayor(n)
	(if(> n 3) T nil)
)

(defun filtrar (f l)
	(cond
		((null l) nil)
		((null (funcall f (car l))) (filtrar f (cdr l)))
		(T (cons (car l) (filtrar f (cdr l))))
	)
)

(defun subconjuntos(l)
	(apply #'mapcar #'list l)
)

(defun maximo(l)
	(if (null l) nil (mapcar l))
)

(defun subconjuntos (l)
	(cond 
		((null l) nil)
		((null (cdr l)) (list (list (car l) ) nil))
		(T (append (insertarprimero (car l) (subconjuntos(cdr l))) (subconjuntos(cdr l))))
	)
)

(defun insertarprimero(a l)
	(mapcar (lambda(x) (cons a x)) l)
)

(defun convocatoria12 (f l)
	(cond
		((null l) nil)
		((null (funcall f (car l))) (convocatoria12 f (cdr l)))
		(T (cons (car l) (convocatoria12 f (cdr l))))
	)
)

(defun borrar_mayores (l n)
	(cond
		((null l) nil)
		((> (car l) n) (borrar_mayores (cdr l) n))
		(T ( cons (car l) (borrar_mayores (cdr l) n)))
	)
)

(defun anidar (l)

	(if (null l) nil (cons (list (car l)) (anidar (cdr l))))
)

(defun potencia(n)
	(if (equal (mod n 2) 0) 1 -1)
)

(defun picuartos (n)
	(cond
		((equal n 0) 1)
		(T (+ (/ (potencia n) (+ 1 (* 2 n))) (picuartos (1- n))))
	)
)

(defun operarlista (l f)
	(cond
		((null l) nil)
		((and (null (cdr l)) (not (null (car l)))) (car l))
		(T (cons (funcall f (car l) (cadr l)) (operarlista (cddr l) f)))
	)
)

(defun cifras (n)
	(cond
		((not (equal n 0)) 
			(cons (funcall #'primeracifra n) (cifras (floor (/ n 10)))))
		((equal n 0) 0)
	)
)

(defun primeracifra (n)
	(if (not (equal (floor (/ n 10)) 0)) (primeracifra (/ n 10)) n)
)

(defun eliminarElementos (f l)
        (cond ((null l) nil)
              ((equal (funcall f (car l)) 0) (eliminarElementos f (cdr l)))
              (T (cons (car l) (eliminarElementos f (cdr l))))
        )
)

(defun SumYProd (&rest l)
	(cond
		((null l) (list 0 0))
		(T (list (apply #'+ l) (apply #'* l)))
	)
)
		
;;REVISAR / ESTUDIAR / EMPOLLAR / APRENDERSELO DE MEMORIA
(defun cerosyunos(&rest l)
    (cond 
        ((null l) (list 0 0 0))
        ((equal (car l) 0) 
            (list 
                (1+ (car(apply #'cerosyunos(cdr l))))
                (cadr (apply #'cerosyunos (cdr l)))
                (caddr (apply #'cerosyunos(cdr l)))
            )
        )
        ((equal (car l) 1) 
            (list 
                (car(apply #'cerosyunos(cdr l)))
                (1+ (cadr (apply #'cerosyunos(cdr l))))
                (caddr (apply #'cerosyunos(cdr l)))
            )
        )
        (T
            (list 
                (car(apply #'cerosyunos(cdr l)))
                (cadr (apply #'cerosyunos(cdr l)))
                (1+ (caddr (apply #'cerosyunos(cdr l))))
            )
        )
    )
)

(defun decimalABinario (n)
    (if (< n 2) n
        (append (decimalABinario (floor(/ n 2))) (list (mod n 2)))
    )
)

(defun aplicarFuncion (f &rest l)
	(if (null l) nil
	(mapcar f l))
)

(defun elementoCentral(l)
	(cond
		((null l) nil)
		((null (cdr l)) (car l))
		(T (elementoCentral(cdr (reverse (cdr l)))))
	)
)

(defun eliminarCentral(l)
	(cond
		((null l) nil)
		((null (cdr l)) nil)
		(T (eliminarCentral(cdr (reverse (cdr l)))))
	)
)

(defun lista_triplicados (l)
	(cond
		((null l) nil)
		(T (mapcar (lambda(x) (list x x x)) l))
	)
)

(defun lista_replicados (l n)
	(cond
		((null l) nil)
		((equal n 0) nil)
		(T (mapcar (funcall calcular l n) l))
	)
)

(defun calcular (l n)
	(cond 
		((null l) nil)
		((equal n 0) calcular (cdr l) n)
		(T (cons (car l) (funcall calcular l (1- n))))
	)
)

(defun unary_functions (l &rest f)
	(cond
		((null l) nil)
		((null f) nil)
		(T (cons (mapcar (car f) l) (unary_functions l (cdr f))))
	)
)


(defun anyadir2pos (l n)
	(if (null l) nil (cons (car l) (cons n (cdr l))))
)
