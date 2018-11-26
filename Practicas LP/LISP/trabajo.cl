(defun producto_lista(l) 
	( if(NULL l) 1 
			(* (car l) (producto_lista (cdr l) ))))
			
(defun borrar(n l)
	(cond
		((NULL l) NIL)
		((equal n 1) (cdr l)) 
		( T (cons (car l) (borrar(- n 1) (cdr l))))
	)
)

(defun aplanar (l)
	(cond
		((NULL l) NIL)
		((atom (car l)) (cons (car l) (aplanar (cdr l))))
		( T (append (aplanar (car l)) (aplanar (cdr l))))
	)
)

(defun aplicar(f n)
	(if (equal n 0) 0 (+ (funcall f n)(aplicar f (- n 1))))
)

(defun sumacuadrados(n)
	(* n n)
)

(defun filtrar(l f)
	(cond
		((NULL l) NIL)
		((funcall f (car l)) (cons (car l) (filtrar (cdr l) f)))
		(T (filtrar (cdr l) f))
	)
)	

(defun mayor(m)
	(if (> m 3) T NIL)
)