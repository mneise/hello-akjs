(ns ^:figwheel-always hello-akjs.core
    (:require [goog.dom :as gdom]))

(enable-console-print!)

(println "Edits to this text should show up in your developer console.")

;; define your app data so that it doesn't get over-written on reload

(defonce app-state (atom {:text "Hello world!"}))


(defn on-js-reload []
  ;; optionally touch your app-state to force rerendering depending on
  ;; your application
  ;; (swap! app-state update-in [:__figwheel_counter] inc)
  )

(defn draw [context]
  (.clearRect context 0 0 300 300)
  (.beginPath context)
  (set! (.-fillStyle context) "#ff00ff")
  (.arc context 100 200 40 0 (* (.-PI js/Math) 2) true)
  (.closePath context)
  (.fill context))

(def context (.getContext (gdom/getElement "app") "2d"))
(draw context)
