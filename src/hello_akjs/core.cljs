(ns ^:figwheel-always hello-akjs.core
    (:require [goog.dom :as dom]))

(enable-console-print!)

(def circle (dom/getElement "my-circle"))
(.setAttribute circle "fill" "tomato")
(.setAttribute circle "r" "30")
(.setAttribute circle "display" "block")
