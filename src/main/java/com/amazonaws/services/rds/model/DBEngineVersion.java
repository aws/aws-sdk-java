/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.rds.model;

/**
 * <p>
 * This data type is used as a response element in the action DescribeDBEngineVersions.
 * </p>
 */
public class DBEngineVersion {

    /**
     * The name of the database engine.
     */
    private String engine;

    /**
     * The version number of the database engine.
     */
    private String engineVersion;

    /**
     * The name of the DBParameterGroupFamily for the database engine.
     */
    private String dBParameterGroupFamily;

    /**
     * The description of the database engine.
     */
    private String dBEngineDescription;

    /**
     * The description of the database engine version.
     */
    private String dBEngineVersionDescription;

    /**
     * Default constructor for a new DBEngineVersion object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DBEngineVersion() {}
    
    /**
     * The name of the database engine.
     *
     * @return The name of the database engine.
     */
    public String getEngine() {
        return engine;
    }
    
    /**
     * The name of the database engine.
     *
     * @param engine The name of the database engine.
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }
    
    /**
     * The name of the database engine.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param engine The name of the database engine.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DBEngineVersion withEngine(String engine) {
        this.engine = engine;
        return this;
    }
    
    
    /**
     * The version number of the database engine.
     *
     * @return The version number of the database engine.
     */
    public String getEngineVersion() {
        return engineVersion;
    }
    
    /**
     * The version number of the database engine.
     *
     * @param engineVersion The version number of the database engine.
     */
    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }
    
    /**
     * The version number of the database engine.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param engineVersion The version number of the database engine.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DBEngineVersion withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    
    
    /**
     * The name of the DBParameterGroupFamily for the database engine.
     *
     * @return The name of the DBParameterGroupFamily for the database engine.
     */
    public String getDBParameterGroupFamily() {
        return dBParameterGroupFamily;
    }
    
    /**
     * The name of the DBParameterGroupFamily for the database engine.
     *
     * @param dBParameterGroupFamily The name of the DBParameterGroupFamily for the database engine.
     */
    public void setDBParameterGroupFamily(String dBParameterGroupFamily) {
        this.dBParameterGroupFamily = dBParameterGroupFamily;
    }
    
    /**
     * The name of the DBParameterGroupFamily for the database engine.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBParameterGroupFamily The name of the DBParameterGroupFamily for the database engine.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DBEngineVersion withDBParameterGroupFamily(String dBParameterGroupFamily) {
        this.dBParameterGroupFamily = dBParameterGroupFamily;
        return this;
    }
    
    
    /**
     * The description of the database engine.
     *
     * @return The description of the database engine.
     */
    public String getDBEngineDescription() {
        return dBEngineDescription;
    }
    
    /**
     * The description of the database engine.
     *
     * @param dBEngineDescription The description of the database engine.
     */
    public void setDBEngineDescription(String dBEngineDescription) {
        this.dBEngineDescription = dBEngineDescription;
    }
    
    /**
     * The description of the database engine.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBEngineDescription The description of the database engine.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DBEngineVersion withDBEngineDescription(String dBEngineDescription) {
        this.dBEngineDescription = dBEngineDescription;
        return this;
    }
    
    
    /**
     * The description of the database engine version.
     *
     * @return The description of the database engine version.
     */
    public String getDBEngineVersionDescription() {
        return dBEngineVersionDescription;
    }
    
    /**
     * The description of the database engine version.
     *
     * @param dBEngineVersionDescription The description of the database engine version.
     */
    public void setDBEngineVersionDescription(String dBEngineVersionDescription) {
        this.dBEngineVersionDescription = dBEngineVersionDescription;
    }
    
    /**
     * The description of the database engine version.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBEngineVersionDescription The description of the database engine version.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DBEngineVersion withDBEngineVersionDescription(String dBEngineVersionDescription) {
        this.dBEngineVersionDescription = dBEngineVersionDescription;
        return this;
    }
    
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (engine != null) sb.append("Engine: " + engine + ", ");
        if (engineVersion != null) sb.append("EngineVersion: " + engineVersion + ", ");
        if (dBParameterGroupFamily != null) sb.append("DBParameterGroupFamily: " + dBParameterGroupFamily + ", ");
        if (dBEngineDescription != null) sb.append("DBEngineDescription: " + dBEngineDescription + ", ");
        if (dBEngineVersionDescription != null) sb.append("DBEngineVersionDescription: " + dBEngineVersionDescription + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode()); 
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode()); 
        hashCode = prime * hashCode + ((getDBParameterGroupFamily() == null) ? 0 : getDBParameterGroupFamily().hashCode()); 
        hashCode = prime * hashCode + ((getDBEngineDescription() == null) ? 0 : getDBEngineDescription().hashCode()); 
        hashCode = prime * hashCode + ((getDBEngineVersionDescription() == null) ? 0 : getDBEngineVersionDescription().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof DBEngineVersion == false) return false;
        DBEngineVersion other = (DBEngineVersion)obj;
        
        if (other.getEngine() == null ^ this.getEngine() == null) return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false) return false; 
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null) return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false) return false; 
        if (other.getDBParameterGroupFamily() == null ^ this.getDBParameterGroupFamily() == null) return false;
        if (other.getDBParameterGroupFamily() != null && other.getDBParameterGroupFamily().equals(this.getDBParameterGroupFamily()) == false) return false; 
        if (other.getDBEngineDescription() == null ^ this.getDBEngineDescription() == null) return false;
        if (other.getDBEngineDescription() != null && other.getDBEngineDescription().equals(this.getDBEngineDescription()) == false) return false; 
        if (other.getDBEngineVersionDescription() == null ^ this.getDBEngineVersionDescription() == null) return false;
        if (other.getDBEngineVersionDescription() != null && other.getDBEngineVersionDescription().equals(this.getDBEngineVersionDescription()) == false) return false; 
        return true;
    }
    
}
    