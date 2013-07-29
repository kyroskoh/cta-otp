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

public class NearestEdgesResult implements org.apache.thrift.TBase<NearestEdgesResult, NearestEdgesResult._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("NearestEdgesResult");

  private static final org.apache.thrift.protocol.TField NEAREST_EDGES_FIELD_DESC = new org.apache.thrift.protocol.TField("nearest_edges", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new NearestEdgesResultStandardSchemeFactory());
    schemes.put(TupleScheme.class, new NearestEdgesResultTupleSchemeFactory());
  }

  private List<EdgeMatch> nearest_edges; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NEAREST_EDGES((short)1, "nearest_edges");

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
        case 1: // NEAREST_EDGES
          return NEAREST_EDGES;
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
  private _Fields optionals[] = {_Fields.NEAREST_EDGES};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NEAREST_EDGES, new org.apache.thrift.meta_data.FieldMetaData("nearest_edges", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, EdgeMatch.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(NearestEdgesResult.class, metaDataMap);
  }

  public NearestEdgesResult() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public NearestEdgesResult(NearestEdgesResult other) {
    if (other.isSetNearest_edges()) {
      List<EdgeMatch> __this__nearest_edges = new ArrayList<EdgeMatch>();
      for (EdgeMatch other_element : other.nearest_edges) {
        __this__nearest_edges.add(new EdgeMatch(other_element));
      }
      this.nearest_edges = __this__nearest_edges;
    }
  }

  public NearestEdgesResult deepCopy() {
    return new NearestEdgesResult(this);
  }

  @Override
  public void clear() {
    this.nearest_edges = null;
  }

  public int getNearest_edgesSize() {
    return (this.nearest_edges == null) ? 0 : this.nearest_edges.size();
  }

  public java.util.Iterator<EdgeMatch> getNearest_edgesIterator() {
    return (this.nearest_edges == null) ? null : this.nearest_edges.iterator();
  }

  public void addToNearest_edges(EdgeMatch elem) {
    if (this.nearest_edges == null) {
      this.nearest_edges = new ArrayList<EdgeMatch>();
    }
    this.nearest_edges.add(elem);
  }

  public List<EdgeMatch> getNearest_edges() {
    return this.nearest_edges;
  }

  public void setNearest_edges(List<EdgeMatch> nearest_edges) {
    this.nearest_edges = nearest_edges;
  }

  public void unsetNearest_edges() {
    this.nearest_edges = null;
  }

  /** Returns true if field nearest_edges is set (has been assigned a value) and false otherwise */
  public boolean isSetNearest_edges() {
    return this.nearest_edges != null;
  }

  public void setNearest_edgesIsSet(boolean value) {
    if (!value) {
      this.nearest_edges = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case NEAREST_EDGES:
      if (value == null) {
        unsetNearest_edges();
      } else {
        setNearest_edges((List<EdgeMatch>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case NEAREST_EDGES:
      return getNearest_edges();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case NEAREST_EDGES:
      return isSetNearest_edges();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof NearestEdgesResult)
      return this.equals((NearestEdgesResult)that);
    return false;
  }

  public boolean equals(NearestEdgesResult that) {
    if (that == null)
      return false;

    boolean this_present_nearest_edges = true && this.isSetNearest_edges();
    boolean that_present_nearest_edges = true && that.isSetNearest_edges();
    if (this_present_nearest_edges || that_present_nearest_edges) {
      if (!(this_present_nearest_edges && that_present_nearest_edges))
        return false;
      if (!this.nearest_edges.equals(that.nearest_edges))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(NearestEdgesResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    NearestEdgesResult typedOther = (NearestEdgesResult)other;

    lastComparison = Boolean.valueOf(isSetNearest_edges()).compareTo(typedOther.isSetNearest_edges());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNearest_edges()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nearest_edges, typedOther.nearest_edges);
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
    StringBuilder sb = new StringBuilder("NearestEdgesResult(");
    boolean first = true;

    if (isSetNearest_edges()) {
      sb.append("nearest_edges:");
      if (this.nearest_edges == null) {
        sb.append("null");
      } else {
        sb.append(this.nearest_edges);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
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

  private static class NearestEdgesResultStandardSchemeFactory implements SchemeFactory {
    public NearestEdgesResultStandardScheme getScheme() {
      return new NearestEdgesResultStandardScheme();
    }
  }

  private static class NearestEdgesResultStandardScheme extends StandardScheme<NearestEdgesResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, NearestEdgesResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NEAREST_EDGES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list16 = iprot.readListBegin();
                struct.nearest_edges = new ArrayList<EdgeMatch>(_list16.size);
                for (int _i17 = 0; _i17 < _list16.size; ++_i17)
                {
                  EdgeMatch _elem18; // required
                  _elem18 = new EdgeMatch();
                  _elem18.read(iprot);
                  struct.nearest_edges.add(_elem18);
                }
                iprot.readListEnd();
              }
              struct.setNearest_edgesIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, NearestEdgesResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.nearest_edges != null) {
        if (struct.isSetNearest_edges()) {
          oprot.writeFieldBegin(NEAREST_EDGES_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.nearest_edges.size()));
            for (EdgeMatch _iter19 : struct.nearest_edges)
            {
              _iter19.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class NearestEdgesResultTupleSchemeFactory implements SchemeFactory {
    public NearestEdgesResultTupleScheme getScheme() {
      return new NearestEdgesResultTupleScheme();
    }
  }

  private static class NearestEdgesResultTupleScheme extends TupleScheme<NearestEdgesResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, NearestEdgesResult struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetNearest_edges()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetNearest_edges()) {
        {
          oprot.writeI32(struct.nearest_edges.size());
          for (EdgeMatch _iter20 : struct.nearest_edges)
          {
            _iter20.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, NearestEdgesResult struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list21 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.nearest_edges = new ArrayList<EdgeMatch>(_list21.size);
          for (int _i22 = 0; _i22 < _list21.size; ++_i22)
          {
            EdgeMatch _elem23; // required
            _elem23 = new EdgeMatch();
            _elem23.read(iprot);
            struct.nearest_edges.add(_elem23);
          }
        }
        struct.setNearest_edgesIsSet(true);
      }
    }
  }

}

