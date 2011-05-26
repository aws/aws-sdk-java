/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#deleteDBParameterGroup(DeleteDBParameterGroupRequest) DeleteDBParameterGroup operation}.
 * <p>
 * Deletes a specified DBParameterGroup. The DBParameterGroup cannot be
 * associated with any RDS instances to be deleted.
 * </p>
 * <p>
 * <b>NOTE:</b> The specified database parameter group cannot be
 * associated with any DB Instances.
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#deleteDBParameterGroup(DeleteDBParameterGroupRequest)
 */
public class DeleteDBParameterGroupRequest extends AmazonWebServiceRequest {

    /**
     * The name of the DB Parameter Group. <p>Constraints: <ul> <li>Must be
     * the name of an existing DB Parameter Group</li> <li>You cannot delete
     * a default DB Parameter Group</li> </ul>
     */
    private String dBParameterGroupName;

    /**
     * Default constructor for a new DeleteDBParameterGroupRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DeleteDBParameterGroupRequest() {}
    
    /**
     * Constructs a new DeleteDBParameterGroupRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param dBParameterGroupName The name of the DB Parameter Group.
     * <p>Constraints: <ul> <li>Must be the name of an existing DB Parameter
     * Group</li> <li>You cannot delete a default DB Parameter Group</li>
     * </ul>
     */
    public DeleteDBParameterGroupRequest(String dBParameterGroupName) {
        this.dBParameterGroupName = dBParameterGroupName;
    }
    
    /**
     * The name of the DB Parameter Group. <p>Constraints: <ul> <li>Must be
     * the name of an existing DB Parameter Group</li> <li>You cannot delete
     * a default DB Parameter Group</li> </ul>
     *
     * @return The name of the DB Parameter Group. <p>Constraints: <ul> <li>Must be
     *         the name of an existing DB Parameter Group</li> <li>You cannot delete
     *         a default DB Parameter Group</li> </ul>
     */
    public String getDBParameterGroupName() {
        return dBParameterGroupName;
    }
    
    /**
     * The name of the DB Parameter Group. <p>Constraints: <ul> <li>Must be
     * the name of an existing DB Parameter Group</li> <li>You cannot delete
     * a default DB Parameter Group</li> </ul>
     *
     * @param dBParameterGroupName The name of the DB Parameter Group. <p>Constraints: <ul> <li>Must be
     *         the name of an existing DB Parameter Group</li> <li>You cannot delete
     *         a default DB Parameter Group</li> </ul>
     */
    public void setDBParameterGroupName(String dBParameterGroupName) {
        this.dBParameterGroupName = dBParameterGroupName;
    }
    
    /**
     * The name of the DB Parameter Group. <p>Constraints: <ul> <li>Must be
     * the name of an existing DB Parameter Group</li> <li>You cannot delete
     * a default DB Parameter Group</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBParameterGroupName The name of the DB Parameter Group. <p>Constraints: <ul> <li>Must be
     *         the name of an existing DB Parameter Group</li> <li>You cannot delete
     *         a default DB Parameter Group</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DeleteDBParameterGroupRequest withDBParameterGroupName(String dBParameterGroupName) {
        this.dBParameterGroupName = dBParameterGroupName;
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
        sb.append("}");
        return sb.toString();
    }
    
}
    