(ns mal.step0_reql
    (:gen-class))

(defn READ
  [strng]
  strng)

(defn EVAL
  [strng]
  strng)

(defn PRINT
  [strng]
  strng)

(defn rep
  [strng]
  PRINT (EVAL (READ strng)))

(defn -main
  "I don't do a whole lot ... yet."
  []
  (print "user> ")
  (flush)
  (let [line (read-line)]
    (when line
      (println (rep line))
      (recur))))
