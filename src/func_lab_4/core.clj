(ns func-lab-4.core)

(defn negative
  "Negativity"
  [x]
  (cond
    (= x true) false
    (= x false) true
    :else nil))


(defn succession
  "succession"
  [x, y]
  (cond
    (= x true) y
    :else true))

(defn factorial [x] (if (<= x 1) 1 (* x (factorial (- x 1)))))

(defn recursive-reverse
  "reverse"
  [x]
  (cond (empty? x)
        []
        :else (conj (recursive-reverse (rest x)) (first x))))

(defn ahalai-mahalai "sherbet sladkii" [x] (cons (first (recursive-reverse x)) (recursive-reverse (cons (first x) (rest (recursive-reverse (rest x)))))))

(defn Mynth
  "return nth"
  [x, y]
  (cond
    (= x 1) (first y)
    :else (Mynth (- x 1) (rest y)))
  )

(defn Mycount
  "return number of atoms"
  [x, y]
  (cond
    (= x ()) y
    :else (Mycount (rest x) (+ y 1)))
  )

(defn trim
  "return list without some stuff"
  [data, patrn, answer]
  (cond
    (= data ()) (recursive-reverse answer)
    :else (trim (rest data) patrn
                (cond
                  (not (= (first data) patrn)) (cons (first data) answer)
                  :else answer
                  )
                ))
  )

;define function as analog of COMMON LISP atom
(defn atom? [a] (cond (not (list? a)) true :else false))

(defn isOneLevel [x]
  (cond (or (= x ()) (atom? x)) true
        :else (and (atom? (first x)) (isOneLevel (rest x))))
  )

(defn countNumbers [x]
  (cond (= x ()) 0
        :else (+ (first x) (countNumbers (rest x))))
  )

(defn countNumbersMultidivisions [x]
  (cond (= x ()) 0
        :else (cond (atom? (first x)) (+ (first x) (countNumbersMultidivisions (rest x)))
                    :else (+ (countNumbersMultidivisions (first x)) (countNumbersMultidivisions (rest x)))
                    )))

(defn preonion [n]
  (cond (= n 0) '(0)
        :else (list n (preonion (- n 1)))
        ))

(defn onion [n]
  ()
  )

























