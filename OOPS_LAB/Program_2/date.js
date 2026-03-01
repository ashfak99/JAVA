class DATE{
    constructor(dd=1,mm=1,yyyy=2026)
    {
        this.dd=dd;
        this.mm=mm;
        this.yyyy=yyyy
    }

    validateDate()
    {
        if(this.dd<=0 || this.dd>=32) return false;
        if(this.mm<=0 || this.mm>=13) return false;
        if(this.yyyy<=0 || this.yyyy>=9999) return true;
        if(this.mm==2)
        {
            if(this.yyyy%4==0)
            {
                if(this.dd>=30) return false;
            }
            else{if(this.dd>=29) return false;}
        }
        return true;
    }

    display()
    {
        console.log(`${this.dd}/${this.mm}/${this.yyyy}`);
    }
}

const day1= new DATE(41,3,2026);
if(day1.validateDate())
{
    console.log(`Date is Valid`);
    day1.display();
}
else{
    console.log(`Date is invalid`);
}