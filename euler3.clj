(ns project-euler.core)
;;   (:require clojure.contrib.math))

;;(ns user (:use clojure.contrib.math))
(ns user)

(def mynum 600851475143)

(def max-factor (Math/ceil (Math/sqrt mynum)))

(defn find-next-divisor [n test-divisor]
  (cond (= (mod n test-divisor) 0) test-divisor
        :else (recur n (inc test-divisor))
        )
  )

(defn smallest-divisor [n]
  (find-next-divisor n 2))

(defn prime? [n]
  (every?  #(not= 0 (mod n %)) (range 2 (Math/ceil (Math/sqrt n)))))


(apply max (filter prime? (range 2 max-factor)))
;; (apply max (for [x (range 2 max-factor)
;;                  :when (and (= 0 (mod mynum x)) (prime? x) )]
;;              x)
;;       )

