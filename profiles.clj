{:user 
 {:signing {:gpg-key "chad@farbetter.com"}
  :dependencies [[pjstadig/humane-test-output "0.6.0"]]
  :injections [(require 'pjstadig.humane-test-output)
               (pjstadig.humane-test-output/activate!)]
  :plugins [[cider/cider-nrepl "0.8.1"]
            [com.jakemccrary/lein-test-refresh "0.5.4"]
            [lein-ancient "0.5.5"]
            [lein-cloverage "1.0.2"]
            [org.bodil/lein-noderepl "0.1.11"]]}}
