(ns advent-of-code-2015.day02
  (:require [clojure.java.io :as io]
            [clojure.string :as s]))

(set! *unchecked-math* :warn-on-boxed)
(set! *warn-on-reflection* true)

;; load data
(def program (mapv read-string
                   (-> (io/resource "day02.txt")
                       (slurp)
                       (s/split #","))))

