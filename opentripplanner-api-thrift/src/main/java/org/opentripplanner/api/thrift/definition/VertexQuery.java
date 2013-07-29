/**
 * Autogenerated by Thrift Compiler (0.8.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.opentripplanner.api.thrift.definition;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VertexQuery implements org.apache.thrift.TBase<VertexQuery, VertexQuery._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("VertexQuery");

  private static final org.apache.thrift.protocol.TField LOCATION_FIELD_DESC = new org.apache.thrift.protocol.TField("location", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField ALLOWED_MODES_FIELD_DESC = new org.apache.thrift.protocol.TField("allowed_modes", org.apache.thrift.protocol.TType.SET, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new VertexQueryStandardSchemeFactory());
    schemes.put(TupleScheme.class, new VertexQueryTupleSchemeFactory());
  }

  private org.opentripplanner.api.thrift.definition.Location location; // required
  private Set<org.opentripplanner.api.thrift.definition.TravelMode> allowed_modes; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    LOCATION((short)1, "location"),
    ALLOWED_MODES((short)2, "allowed_modes");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // LOCATION
          return LOCATION;
        case 2: // ALLOWED_MODES
          return ALLOWED_MODES;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private _Fields optionals[] = {_Fields.ALLOWED_MODES};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.LOCATION, new org.apache.thrift.meta_data.FieldMetaData("location", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT        , "Location")));
    tmpMap.put(_Fields.ALLOWED_MODES, new org.apache.thrift.meta_data.FieldMetaData("allowed_modes", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.SetMetaData(org.apache.thrift.protocol.TType.SET, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.ENUM            , "TravelMode"))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(VertexQuery.class, metaDataMap);
  }

  public VertexQuery() {
  }

  public VertexQuery(
    org.opentripplanner.api.thrift.definition.Location location)
  {
    this();
    this.location = location;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public VertexQuery(VertexQuery other) {
    if (other.isSetLocation()) {
      this.location = other.location;
    }
    if (other.isSetAllowed_modes()) {
      Set<org.opentripplanner.api.thrift.definition.TravelMode> __this__allowed_modes = new HashSet<org.opentripplanner.api.thrift.definition.TravelMode>();
      for (org.opentripplanner.api.thrift.definition.TravelMode other_element : other.allowed_modes) {
        __this__allowed_modes.add(other_element);
      }
      this.allowed_modes = __this__allowed_modes;
    }
  }

  public VertexQuery deepCopy() {
    return new VertexQuery(this);
  }

  @Override
  public void clear() {
    this.location = null;
    this.allowed_modes = null;
  }

  public org.opentripplanner.api.thrift.definition.Location getLocation() {
    return this.location;
  }

  public void setLocation(org.opentripplanner.api.thrift.definition.Location location) {
    this.location = location;
  }

  public void unsetLocation() {
    this.location = null;
  }

  /** Returns true if field location is set (has been assigned a value) and false otherwise */
  public boolean isSetLocation() {
    return this.location != null;
  }

  public void setLocationIsSet(boolean value) {
    if (!value) {
      this.location = null;
    }
  }

  public int getAllowed_modesSize() {
    return (this.allowed_modes == null) ? 0 : this.allowed_modes.size();
  }

  public java.util.Iterator<org.opentripplanner.api.thrift.definition.TravelMode> getAllowed_modesIterator() {
    return (this.allowed_modes == null) ? null : this.allowed_modes.iterator();
  }

  public void addToAllowed_modes(org.opentripplanner.api.thrift.definition.TravelMode elem) {
    if (this.allowed_modes == null) {
      this.allowed_modes = new HashSet<org.opentripplanner.api.thrift.definition.TravelMode>();
    }
    this.allowed_modes.add(elem);
  }

  public Set<org.opentripplanner.api.thrift.definition.TravelMode> getAllowed_modes() {
    return this.allowed_modes;
  }

  public void setAllowed_modes(Set<org.opentripplanner.api.thrift.definition.TravelMode> allowed_modes) {
    this.allowed_modes = allowed_modes;
  }

  public void unsetAllowed_modes() {
    this.allowed_modes = null;
  }

  /** Returns true if field allowed_modes is set (has been assigned a value) and false otherwise */
  public boolean isSetAllowed_modes() {
    return this.allowed_modes != null;
  }

  public void setAllowed_modesIsSet(boolean value) {
    if (!value) {
      this.allowed_modes = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case LOCATION:
      if (value == null) {
        unsetLocation();
      } else {
        setLocation((org.opentripplanner.api.thrift.definition.Location)value);
      }
      break;

    case ALLOWED_MODES:
      if (value == null) {
        unsetAllowed_modes();
      } else {
        setAllowed_modes((Set<org.opentripplanner.api.thrift.definition.TravelMode>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case LOCATION:
      return getLocation();

    case ALLOWED_MODES:
      return getAllowed_modes();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case LOCATION:
      return isSetLocation();
    case ALLOWED_MODES:
      return isSetAllowed_modes();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof VertexQuery)
      return this.equals((VertexQuery)that);
    return false;
  }

  public boolean equals(VertexQuery that) {
    if (that == null)
      return false;

    boolean this_present_location = true && this.isSetLocation();
    boolean that_present_location = true && that.isSetLocation();
    if (this_present_location || that_present_location) {
      if (!(this_present_location && that_present_location))
        return false;
      if (!this.location.equals(that.location))
        return false;
    }

    boolean this_present_allowed_modes = true && this.isSetAllowed_modes();
    boolean that_present_allowed_modes = true && that.isSetAllowed_modes();
    if (this_present_allowed_modes || that_present_allowed_modes) {
      if (!(this_present_allowed_modes && that_present_allowed_modes))
        return false;
      if (!this.allowed_modes.equals(that.allowed_modes))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(VertexQuery other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    VertexQuery typedOther = (VertexQuery)other;

    lastComparison = Boolean.valueOf(isSetLocation()).compareTo(typedOther.isSetLocation());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLocation()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.location, typedOther.location);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAllowed_modes()).compareTo(typedOther.isSetAllowed_modes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAllowed_modes()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.allowed_modes, typedOther.allowed_modes);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("VertexQuery(");
    boolean first = true;

    sb.append("location:");
    if (this.location == null) {
      sb.append("null");
    } else {
      sb.append(this.location);
    }
    first = false;
    if (isSetAllowed_modes()) {
      if (!first) sb.append(", ");
      sb.append("allowed_modes:");
      if (this.allowed_modes == null) {
        sb.append("null");
      } else {
        sb.append(this.allowed_modes);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetLocation()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'location' is unset! Struct:" + toString());
    }

  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class VertexQueryStandardSchemeFactory implements SchemeFactory {
    public VertexQueryStandardScheme getScheme() {
      return new VertexQueryStandardScheme();
    }
  }

  private static class VertexQueryStandardScheme extends StandardScheme<VertexQuery> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, VertexQuery struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // LOCATION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.location = new org.opentripplanner.api.thrift.definition.Location();
              struct.location.read(iprot);
              struct.setLocationIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ALLOWED_MODES
            if (schemeField.type == org.apache.thrift.protocol.TType.SET) {
              {
                org.apache.thrift.protocol.TSet _set0 = iprot.readSetBegin();
                struct.allowed_modes = new HashSet<org.opentripplanner.api.thrift.definition.TravelMode>(2*_set0.size);
                for (int _i1 = 0; _i1 < _set0.size; ++_i1)
                {
                  org.opentripplanner.api.thrift.definition.TravelMode _elem2; // required
                  _elem2 = org.opentripplanner.api.thrift.definition.TravelMode.findByValue(iprot.readI32());
                  struct.allowed_modes.add(_elem2);
                }
                iprot.readSetEnd();
              }
              struct.setAllowed_modesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, VertexQuery struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.location != null) {
        oprot.writeFieldBegin(LOCATION_FIELD_DESC);
        struct.location.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.allowed_modes != null) {
        if (struct.isSetAllowed_modes()) {
          oprot.writeFieldBegin(ALLOWED_MODES_FIELD_DESC);
          {
            oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.I32, struct.allowed_modes.size()));
            for (org.opentripplanner.api.thrift.definition.TravelMode _iter3 : struct.allowed_modes)
            {
              oprot.writeI32(_iter3.getValue());
            }
            oprot.writeSetEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class VertexQueryTupleSchemeFactory implements SchemeFactory {
    public VertexQueryTupleScheme getScheme() {
      return new VertexQueryTupleScheme();
    }
  }

  private static class VertexQueryTupleScheme extends TupleScheme<VertexQuery> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, VertexQuery struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.location.write(oprot);
      BitSet optionals = new BitSet();
      if (struct.isSetAllowed_modes()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetAllowed_modes()) {
        {
          oprot.writeI32(struct.allowed_modes.size());
          for (org.opentripplanner.api.thrift.definition.TravelMode _iter4 : struct.allowed_modes)
          {
            oprot.writeI32(_iter4.getValue());
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, VertexQuery struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.location = new org.opentripplanner.api.thrift.definition.Location();
      struct.location.read(iprot);
      struct.setLocationIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TSet _set5 = new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.I32, iprot.readI32());
          struct.allowed_modes = new HashSet<org.opentripplanner.api.thrift.definition.TravelMode>(2*_set5.size);
          for (int _i6 = 0; _i6 < _set5.size; ++_i6)
          {
            org.opentripplanner.api.thrift.definition.TravelMode _elem7; // required
            _elem7 = org.opentripplanner.api.thrift.definition.TravelMode.findByValue(iprot.readI32());
            struct.allowed_modes.add(_elem7);
          }
        }
        struct.setAllowed_modesIsSet(true);
      }
    }
  }

}

