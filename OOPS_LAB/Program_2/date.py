class DATE:
    def __init__(self,dd,mm,yyyy):
        self.day=dd
        self.month=mm
        self.year=yyyy
    
    def validateDate(self):
        if self.day <= 0 or self.day>=32:
            return False
        
        if self.month<=0 or self.month>=13:
            return False
        
        if self.year<=0 or self.year>=9999:
            return False
        
        if self.month==2:
            if self.year%4==0:
                if self.day>=30:
                    return False
            else:
                if self.day>=29:
                    return False
                
        return True
    
    def display(self):
        print(f"{self.day}/{self.month}/{self.year}")


if __name__=="__main__":
    day1=DATE(29,2,2024)
    if day1.validateDate():
        print("Date is valid")
        day1.display()
    else:
        print("Date is invalid")