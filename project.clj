(defproject address_book "1.0.0-SNAPSHOT"
  :description "Address Book"
  :dependencies [[org.clojure/clojure "1.5.0"]
                 [org.clojure/clojure-contrib "1.2.0"]
                 [compojure "1.1.5"]
                 [ring/ring-jetty-adapter "1.1.0"]]
  :plugins [[lein-swank "1.4.5"]]
  :main address_book.webserver)
