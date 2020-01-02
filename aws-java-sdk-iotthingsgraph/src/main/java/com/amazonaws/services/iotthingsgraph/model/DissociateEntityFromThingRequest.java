/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.iotthingsgraph.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/DissociateEntityFromThing"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DissociateEntityFromThingRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the thing to disassociate.
     * </p>
     */
    private String thingName;
    /**
     * <p>
     * The entity type from which to disassociate the thing.
     * </p>
     */
    private String entityType;

    /**
     * <p>
     * The name of the thing to disassociate.
     * </p>
     * 
     * @param thingName
     *        The name of the thing to disassociate.
     */

    public void setThingName(String thingName) {
        this.thingName = thingName;
    }

    /**
     * <p>
     * The name of the thing to disassociate.
     * </p>
     * 
     * @return The name of the thing to disassociate.
     */

    public String getThingName() {
        return this.thingName;
    }

    /**
     * <p>
     * The name of the thing to disassociate.
     * </p>
     * 
     * @param thingName
     *        The name of the thing to disassociate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DissociateEntityFromThingRequest withThingName(String thingName) {
        setThingName(thingName);
        return this;
    }

    /**
     * <p>
     * The entity type from which to disassociate the thing.
     * </p>
     * 
     * @param entityType
     *        The entity type from which to disassociate the thing.
     * @see EntityType
     */

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    /**
     * <p>
     * The entity type from which to disassociate the thing.
     * </p>
     * 
     * @return The entity type from which to disassociate the thing.
     * @see EntityType
     */

    public String getEntityType() {
        return this.entityType;
    }

    /**
     * <p>
     * The entity type from which to disassociate the thing.
     * </p>
     * 
     * @param entityType
     *        The entity type from which to disassociate the thing.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EntityType
     */

    public DissociateEntityFromThingRequest withEntityType(String entityType) {
        setEntityType(entityType);
        return this;
    }

    /**
     * <p>
     * The entity type from which to disassociate the thing.
     * </p>
     * 
     * @param entityType
     *        The entity type from which to disassociate the thing.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EntityType
     */

    public DissociateEntityFromThingRequest withEntityType(EntityType entityType) {
        this.entityType = entityType.toString();
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getThingName() != null)
            sb.append("ThingName: ").append(getThingName()).append(",");
        if (getEntityType() != null)
            sb.append("EntityType: ").append(getEntityType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DissociateEntityFromThingRequest == false)
            return false;
        DissociateEntityFromThingRequest other = (DissociateEntityFromThingRequest) obj;
        if (other.getThingName() == null ^ this.getThingName() == null)
            return false;
        if (other.getThingName() != null && other.getThingName().equals(this.getThingName()) == false)
            return false;
        if (other.getEntityType() == null ^ this.getEntityType() == null)
            return false;
        if (other.getEntityType() != null && other.getEntityType().equals(this.getEntityType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getThingName() == null) ? 0 : getThingName().hashCode());
        hashCode = prime * hashCode + ((getEntityType() == null) ? 0 : getEntityType().hashCode());
        return hashCode;
    }

    @Override
    public DissociateEntityFromThingRequest clone() {
        return (DissociateEntityFromThingRequest) super.clone();
    }

}
