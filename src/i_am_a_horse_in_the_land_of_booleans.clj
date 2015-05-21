(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))
(defn boolean [x]
  (if x
    true
    false
  ))

(defn abs [x]
  (if (< x 0)
    (* x -1)
    x))

(defn divides? [divisor n]
  (if (== (mod n divisor) 0)
    true
    false))

(defn fizzbuzz [divisible]
  (cond
   (== (mod divisible 15) 0) "gotcha!"
   (== (mod divisible 5) 0) "buzz"
   (== (mod divisible 3) 0) "fizz"
   :else ""))

(defn teen?
  [isTeen]
  (and (> isTeen 12) (< isTeen 20)))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
   (number? x) (* 2 x)

   (empty? x) nil
   (list? x) (* 2 (count x))
   (vector? x) (* 2 (count x))
   :else
   true
   ))

(defn leap-year? [year]
  (cond
   (divides? 400 year) true
   (divides? 100 year) false
   (divides? 4 year) true
   :else
   false
   ))

; '_______'
