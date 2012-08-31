;;heroku config:add  JVM_OPTS

(defproject renderit "0.0.1"
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [ring/ring-core "1.1.1"]
                 [ring/ring-jetty-adapter "1.1.1"]
                 [compojure "1.1.1"]
                 [ring-json-response "0.2.0"]
                 [net.sourceforge.plantuml/plantuml "7933"]
                 [tentacles "0.2.0-beta1"]
                 [enlive "1.0.1"]]
  :profiles {
    :production {
      :mirrors {
        #"central|clojars" "http://s3pository.herokuapp.com/clojure"
      }
    }
  }
  :min-lein-version "2.0.0")