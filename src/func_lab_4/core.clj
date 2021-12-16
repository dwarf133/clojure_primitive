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
    ( = x true) y
    :else true))

(defn factorial[x] (if (<= x 1) 1 (* x  (factorial  (- x 1)))))

(defn recursive-reverse
  "reverse"
  [x]
  (cond (empty? x)
    []
    :else (conj (recursive-reverse (rest x)) (first x)  )))

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
                  (not (= (first data) patrn)) (cons (first data) answer )
                  :else answer
                  )
                ))
  )

