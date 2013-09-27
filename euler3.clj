(ns project-euler.core
   (:require clojure.contrib.math))

(ns user (:use clojure.contrib.math))

(def mynum 600851475143)

(def max-factor (ceil (sqrt mynum)))

(defn find-next-divisor [n test-divisor]
  (cond (> test-divisor (sqrt n) ) n
        (= (mod n test-divisor) 0) test-divisor
        :else (find-divisor n (+ test-divisor 1))
        )
  )

(defn smallest-divisor [n]
  (find-next-divisor n 2))

(defn prime? [n]
  (= n (smallest-divisor n)))

(apply max (for [x (range 2 max-factor)
             :when (and (= 0 (mod mynum x)) (prime? x) )]
         x)
     )

