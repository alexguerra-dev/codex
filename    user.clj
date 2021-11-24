(ns user)

;;(slurp "https://google.com")

(comment
  true

  (println "I am new at this")
  (println "Wahoo... I did something good")
  (println "I did something bad")
  (println "Make some structure data")
  ;; Everything here is a side effect
 

  (def ada {:name "Ada Guerra"
            :songs ["Ada is a good girl a good a good girl Ada is a good girl"
                    "Ada kunada the Texas tornada"
                    "Ada tails wahooo"
                    ""]
            :toys ["lamb" "headgehog" "Octopus"]
            })
  (def sprinkle-sourtoes {:name "Sprinkle Sourtoes"
                          :age 28 
                          :stats {:hp 100
                                  :mp 50}})
  (read-line)
  (def parts-of-speach ["Verb" 
                        "Adjactive"
                        "Adverb"
                        "Onimonapia"
                        "Exclimation"
                        "Noun"])

  (def super-heros [{}
                    "Batman" 
                    "Cat Woman"
                    "Thor" 
                    "Spider Man"
                    "Dr. Strange"
                    "Hulk"
                    ""])

  (def a-value-from-read-line (read-line))

  (println a-value-from-read-line)
  )

