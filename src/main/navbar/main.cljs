(ns navbar.main
      (:require [reagent.dom :as rdom])
      )

(defn some-component []
      [:div
       [:h3 "I am a component"]
       [:p.someclass
        "I have " [:strong "bold"]
        [:span {:style {:color "red"}} " and red"]
        " text."]])

(defn init []
      (println "Hello World")
      (rdom/render [some-component] (js/document.querySelector "#app"))
      )

(defn ^:dev/before-load stop []
      (js/console.log "shadow-cljs stop"))

(defn ^:dev/after-load start []
      (js/console.log "shadow-cljs start")
      (rdom/render [some-component] (js/document.querySelector "#app"))
      )