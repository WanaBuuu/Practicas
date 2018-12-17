(defun eliminarprimero (&rest l)
	(mapcar #'cdr l)
)

(defun cogerprimero (&rest l)
	(mapcar #'car l)
)

(defun insertarprimero(a l)
	(mapcar (lambda(x) (cons a x)) l)
)

(defun transpuesta(l)
	(apply #'mapcar #'list l)
)

(defun maximo2 (l)
	(cond
		((NULL l) NIL)
		((atom (car l)) 
		    (if (NULL (cdr l)) 
			    (car l)
			    (max (car l) (maximo2 (cdr l)))
			)
		)
		(T (if (NULL (cdr l))
			    (maximo2 (car l))
					(max (maximo2 (car l))(maximo2 (cdr l))))
		)
	)
)

(defun aplicarFunciones (f1 f2 l)
	(cond
		((NULL l) NIL)
		((NULL (cdr l)) (list (funcall f1 (car l))))
		(T (cons (funcall f1 (car l))
			(cons (funcall f2 (cadr l)) (aplicarFunciones f1 f2 (cddr l))))
		)
	)
)

(defun listar (&rest l)
	l
)
