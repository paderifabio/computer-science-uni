library(stringr)

quantita = as.numeric(readline(prompt = "Inserisci la quantità iniziale: " ))
quantitaIniziale = quantita

cinquantaCent = as.integer(quantita/50)
quantita = quantita %% 50

ventiCent = as.integer(quantita/20)
quantita = quantita %% 20

dieciCent = as.integer(quantita/10)
quantita = quantita %% 10

cinqueCent = as.integer(quantita/5)
quantita = quantita %% 5

dueCent = as.integer(quantita/2)
quantita = quantita %% 2

unCent = as.integer(quantita/1)
quantita = quantita %% 1


paste("Quantità:", quantitaIniziale) %>% 
cat(str_c("Le monete da 50 cent sono:",cinquantaCent, sep = " "), sep = "\n") %>% 
      cat(str_c("Le monete da 20 cent sono:",ventiCent, sep = " "), sep = "") %>% 
      cat(str_c("Le monete da 10 cent sono:",dieciCent, sep = " "), sep = "\n") %>% 
      cat(str_c("Le monete da 5 cent sono:",cinqueCent, sep = " "), sep = "") %>% 
      cat(str_c("Le monete da 2 cent sono:",dueCent, sep = " "), sep = "\n") %>% 
      cat(str_c("Le monete da 1 cent sono:",unCent, sep = " "), sep = "") 
