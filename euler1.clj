(ns project-euler.core)

(defn fibonacci [arr max-val]
  (if (> (last arr) max-val) 
    (rest arr)
    (fibonacci (conj arr
                     (+ (nth arr (- (count arr) 1) )
                        (nth arr (- (count arr) 2) ))  ) max-val)
    )
  )

(reduce + (for [x (fibonacci [1 1] 4000000)
             :when (even? x)]
         x) )