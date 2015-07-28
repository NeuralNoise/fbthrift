/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */


import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.facebook.thrift.lite.*;
import com.facebook.thrift.lite.protocol.*;
import com.facebook.thrift.lite.annotations.*;


public class ModuleLogger {

  public final Module.EventType mEventType;

  private final Map<ThriftProperty<?>, Object> mMap = new HashMap<ThriftProperty<?>, Object>();

  public ModuleLogger(Module.EventType type) {
    mEventType = type;
  }

  public <T> ModuleLogger addProperty(ThriftProperty<T> property, T value) {
    mMap.put(property, value);
    return this;
  }

  public static <T> void writeFieldBegin(TBinaryProtocol oprot, ThriftProperty<T> field) throws IOException {
    TField tField = new TField(field.key, field.type, field.id);
    oprot.writeFieldBegin(tField);
  }

  public void write(TBinaryProtocol oprot) throws IOException {
    switch (mEventType) {
      case Color: {
        oprot.writeStructBegin(new TStruct("Color"));
        if (mMap.containsKey(Module.Color_red) && mMap.get(Module.Color_red) != null) {
          writeFieldBegin(oprot, Module.Color_red);
          oprot.writeDouble((double) mMap.get(Module.Color_red));
          oprot.writeFieldEnd();
        }
      
        if (mMap.containsKey(Module.Color_green) && mMap.get(Module.Color_green) != null) {
          writeFieldBegin(oprot, Module.Color_green);
          oprot.writeDouble((double) mMap.get(Module.Color_green));
          oprot.writeFieldEnd();
        }
      
        if (mMap.containsKey(Module.Color_blue) && mMap.get(Module.Color_blue) != null) {
          writeFieldBegin(oprot, Module.Color_blue);
          oprot.writeDouble((double) mMap.get(Module.Color_blue));
          oprot.writeFieldEnd();
        }
      
        if (mMap.containsKey(Module.Color_alpha) && mMap.get(Module.Color_alpha) != null) {
          writeFieldBegin(oprot, Module.Color_alpha);
          oprot.writeDouble((double) mMap.get(Module.Color_alpha));
          oprot.writeFieldEnd();
        }
      
        oprot.writeFieldStop();
        oprot.writeStructEnd();
        break;
      }
      
      case Vehicle: {
        oprot.writeStructBegin(new TStruct("Vehicle"));
        if (mMap.containsKey(Module.Vehicle_color) && mMap.get(Module.Vehicle_color) != null) {
          writeFieldBegin(oprot, Module.Vehicle_color);
          ((ModuleLogger) mMap.get(Module.Vehicle_color)).write(oprot);
          oprot.writeFieldEnd();
        }
      
        if (mMap.containsKey(Module.Vehicle_licensePlate) && mMap.get(Module.Vehicle_licensePlate) != null) {
          writeFieldBegin(oprot, Module.Vehicle_licensePlate);
          oprot.writeString((String) mMap.get(Module.Vehicle_licensePlate));
          oprot.writeFieldEnd();
        }
      
        if (mMap.containsKey(Module.Vehicle_description) && mMap.get(Module.Vehicle_description) != null) {
          writeFieldBegin(oprot, Module.Vehicle_description);
          oprot.writeString((String) mMap.get(Module.Vehicle_description));
          oprot.writeFieldEnd();
        }
      
        if (mMap.containsKey(Module.Vehicle_name) && mMap.get(Module.Vehicle_name) != null) {
          writeFieldBegin(oprot, Module.Vehicle_name);
          oprot.writeString((String) mMap.get(Module.Vehicle_name));
          oprot.writeFieldEnd();
        }
      
        oprot.writeFieldStop();
        oprot.writeStructEnd();
        break;
      }
      
      case Person: {
        oprot.writeStructBegin(new TStruct("Person"));
        if (mMap.containsKey(Module.Person_id) && mMap.get(Module.Person_id) != null) {
          writeFieldBegin(oprot, Module.Person_id);
          oprot.writeI64((long) mMap.get(Module.Person_id));
          oprot.writeFieldEnd();
        }
      
        if (mMap.containsKey(Module.Person_name) && mMap.get(Module.Person_name) != null) {
          writeFieldBegin(oprot, Module.Person_name);
          oprot.writeString((String) mMap.get(Module.Person_name));
          oprot.writeFieldEnd();
        }
      
        if (mMap.containsKey(Module.Person_age) && mMap.get(Module.Person_age) != null) {
          writeFieldBegin(oprot, Module.Person_age);
          oprot.writeI16((short) mMap.get(Module.Person_age));
          oprot.writeFieldEnd();
        }
      
        if (mMap.containsKey(Module.Person_address) && mMap.get(Module.Person_address) != null) {
          writeFieldBegin(oprot, Module.Person_address);
          oprot.writeString((String) mMap.get(Module.Person_address));
          oprot.writeFieldEnd();
        }
      
        if (mMap.containsKey(Module.Person_favoriteColor) && mMap.get(Module.Person_favoriteColor) != null) {
          writeFieldBegin(oprot, Module.Person_favoriteColor);
          ((ModuleLogger) mMap.get(Module.Person_favoriteColor)).write(oprot);
          oprot.writeFieldEnd();
        }
      
        if (mMap.containsKey(Module.Person_friends) && mMap.get(Module.Person_friends) != null) {
          writeFieldBegin(oprot, Module.Person_friends);
          Set<Long> var0 = (Set<Long>) mMap.get(Module.Person_friends);
          oprot.writeSetBegin(new TSet(TType.I64, var0.size()));
          for(long iter0 : var0) {
            oprot.writeI64(iter0);
          }
          oprot.writeSetEnd();
          oprot.writeFieldEnd();
        }
      
        if (mMap.containsKey(Module.Person_bestFriend) && mMap.get(Module.Person_bestFriend) != null) {
          writeFieldBegin(oprot, Module.Person_bestFriend);
          oprot.writeI64((long) mMap.get(Module.Person_bestFriend));
          oprot.writeFieldEnd();
        }
      
        if (mMap.containsKey(Module.Person_petNames) && mMap.get(Module.Person_petNames) != null) {
          writeFieldBegin(oprot, Module.Person_petNames);
          Map<ModuleEnum,String> var0 = (Map<ModuleEnum,String>) mMap.get(Module.Person_petNames);
          oprot.writeMapBegin(new TMap(TType.I32, TType.STRING, var0.size()));
          for (Map.Entry<ModuleEnum, String> iter0 : var0.entrySet()) {
            oprot.writeI32(iter0.getKey().getValue());
            oprot.writeString(iter0.getValue());
          }
          oprot.writeMapEnd();
          oprot.writeFieldEnd();
        }
      
        if (mMap.containsKey(Module.Person_afraidOfAnimal) && mMap.get(Module.Person_afraidOfAnimal) != null) {
          writeFieldBegin(oprot, Module.Person_afraidOfAnimal);
          oprot.writeI32(((ModuleEnum)mMap.get(Module.Person_afraidOfAnimal)).getValue());
          oprot.writeFieldEnd();
        }
      
        if (mMap.containsKey(Module.Person_vehicles) && mMap.get(Module.Person_vehicles) != null) {
          writeFieldBegin(oprot, Module.Person_vehicles);
          List<ModuleLogger> var0 = (List<ModuleLogger>) mMap.get(Module.Person_vehicles);
          oprot.writeListBegin(new TList(TType.STRUCT, var0.size()));
          for (ModuleLogger iter0 : var0) {
            iter0.write(oprot);
          }
          oprot.writeListEnd();
          oprot.writeFieldEnd();
        }
      
        oprot.writeFieldStop();
        oprot.writeStructEnd();
        break;
      }
      
      
    }
  }
}
