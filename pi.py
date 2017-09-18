
from networktables import NetworkTable

class test:
        ip = 'roborio-2643-frc.local'
        ip2 = '10.26.43.20'
        NetworkTable.setIPAddress(ip2)
        NetworkTable.setClientMode()
        NetworkTable.initialize()
        table = NetworkTable.getTable("Vision")
        x = 0

        def sendVal(val):
                self.table.putNumber("Hello", val)

        while 1:
                table.putNumber("Hello", x)
                print(table.getNumber("Hello", 0))
                x+=1