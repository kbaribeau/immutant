(defproject org.immutant/immutant-core-module "1.0.3-SNAPSHOT"
  :parent [org.immutant/immutant-modules-parent "1.0.3-SNAPSHOT" :relative-path "../pom.xml"]
  :dependencies [[org.immutant/immutant-common-module "1.0.3-SNAPSHOT"]
                 [org.immutant/immutant-bootstrap-module "1.0.3-SNAPSHOT"]
                 [org.projectodd/polyglot-core "1.x.incremental.61"]
                 [org.projectodd.shimdandy/shimdandy-api "1.0.1"]
                 [org.jboss.as/jboss-as-jmx "7.2.x.slim.incremental.12"]]
  :profiles {:dev {:resource-paths ["src/test/resources"]
                   :dependencies [[lein-modules "0.1.0-SNAPSHOT" :scope "test"]]}})
