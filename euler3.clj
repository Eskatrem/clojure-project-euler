(ns project-euler.core
   (:require clojure.contrib.math))

(ns user (:use clojure.contrib.math))

(def mynum 600851475143)

(def max-factor (round (ceil (sqrt mynum))))