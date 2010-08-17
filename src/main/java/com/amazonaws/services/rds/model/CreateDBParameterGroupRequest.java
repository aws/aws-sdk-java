/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#createDBParameterGroup(CreateDBParameterGroupRequest) CreateDBParameterGroup operation}.
 * <p>
 * This API creates a new database parameter group.
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#createDBParameterGroup(CreateDBParameterGroupRequest)
 */
public class CreateDBParameterGroupRequest extends AmazonWebServiceRequest {

    /**
     * The name of the DB Parameter Group.
     */
    private String dBParameterGroupName;

    /**
     * The name of the DB Parameter Group Family the DB Parameter Group can
     * be used with.
     */
    private String dBParameterGroupFamily;

    /**
     * The description for the DB Parameter Group.
     */
    private String description;

    /**
     * Default constructor for a new CreateDBParameterGroupRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public CreateDBParameterGroupRequest() {}
    
    /**
     * Constructs a new CreateDBParameterGroupRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param dBParameterGroupName The name of the DB Parameter Group.
     * @param dBParameterGroupFamily The name of the DB Parameter Group
     * Family the DB Parameter Group can be used with.
     * @param description The description for the DB Parameter Group.
     */
    public CreateDBParameterGroupRequest(String dBParameterGroupName, String dBParameterGroupFamily, String description) {
        this.dBParameterGroupName = dBParameterGroupName;
        this.dBParameterGroupFamily = dBParameterGroupFamily;
        this.description = description;
    }
    
    /**
     * The name of the DB Parameter Group.
     *
     * @return The name of the DB Parameter Group.
     */
    public String getDBParameterGroupName() {
        return dBParameterGroupName;
    }
    
    /**
     * The name of the DB Parameter Group.
     *
     * @param dBParameterGroupName The name of the DB Parameter Group.
     */
    public void setDBParameterGroupName(String dBParameterGroupName) {
        this.dBParameterGroupName = dBParameterGroupName;
    }
    
    /**
     * The name of the DB Parameter Group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBParameterGroupName The name of the DB Parameter Group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateDBParameterGroupRequest withDBParameterGroupName(String dBParameterGroupName) {
        this.dBParameterGroupName = dBParameterGroupName;
        return this;
    }
    
    
    /**
     * The name of the DB Parameter Group Family the DB Parameter Group can
     * be used with.
     *
     * @return The name of the DB Parameter Group Family the DB Parameter Group can
     *         be used with.
     */
    public String getDBParameterGroupFamily() {
        return dBParameterGroupFamily;
    }
    
    /**
     * The name of the DB Parameter Group Family the DB Parameter Group can
     * be used with.
     *
     * @param dBParameterGroupFamily The name of the DB Parameter Group Family the DB Parameter Group can
     *         be used with.
     */
    public void setDBParameterGroupFamily(String dBParameterGroupFamily) {
        this.dBParameterGroupFamily = dBParameterGroupFamily;
    }
    
    /**
     * The name of the DB Parameter Group Family the DB Parameter Group can
     * be used with.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBParameterGroupFamily The name of the DB Parameter Group Family the DB Parameter Group can
     *         be used with.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateDBParameterGroupRequest withDBParameterGroupFamily(String dBParameterGroupFamily) {
        this.dBParameterGroupFamily = dBParameterGroupFamily;
        return this;
    }
    
    
    /**
     * The description for the DB Parameter Group.
     *
     * @return The description for the DB Parameter Group.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * The description for the DB Parameter Group.
     *
     * @param description The description for the DB Parameter Group.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * The description for the DB Parameter Group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description The description for the DB Parameter Group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateDBParameterGroupRequest withDescription(String description) {
        this.description = description;
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
        sb.append("DBParameterGroupName: " + dBParameterGroupName + ", ");
        sb.append("DBParameterGroupFamily: " + dBParameterGroupFamily + ", ");
        sb.append("Description: " + description + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    