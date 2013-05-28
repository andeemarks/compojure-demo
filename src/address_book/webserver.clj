(ns address_book.webserver
  (:use [compojure.core]
        [ring.adapter.jetty]
        [address_book.routes :as routes]))

(run-jetty address-book {:port 8080})
