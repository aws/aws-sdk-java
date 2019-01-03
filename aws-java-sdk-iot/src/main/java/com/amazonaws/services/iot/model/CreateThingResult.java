/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The output of the CreateThing operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateThingResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the new thing.
     * </p>
     */
    private String thingName;
    /**
     * <p>
     * The ARN of the new thing.
     * </p>
     */
    private String thingArn;
    /**
     * <p>
     * The thing ID.
     * </p>
     */
    private String thingId;

    /**
     * <p>
     * The name of the new thing.
     * </p>
     * 
     * @param thingName
     *        The name of the new thing.
     */

    public void setThingName(String thingName) {
        this.thingName = thingName;
    }

    /**
     * <p>
     * The name of the new thing.
     * </p>
     * 
     * @return The name of the new thing.
     */

    public String getThingName() {
        return this.thingName;
    }

    /**
     * <p>
     * The name of the new thing.
     * </p>
     * 
     * @param thingName
     *        The name of the new thing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateThingResult withThingName(String thingName) {
        setThingName(thingName);
        return this;
    }

    /**
     * <p>
     * The ARN of the new thing.
     * </p>
     * 
     * @param thingArn
     *        The ARN of the new thing.
     */

    public void setThingArn(String thingArn) {
        this.thingArn = thingArn;
    }

    /**
     * <p>
     * The ARN of the new thing.
     * </p>
     * 
     * @return The ARN of the new thing.
     */

    public String getThingArn() {
        return this.thingArn;
    }

    /**
     * <p>
     * The ARN of the new thing.
     * </p>
     * 
     * @param thingArn
     *        The ARN of the new thing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateThingResult withThingArn(String thingArn) {
        setThingArn(thingArn);
        return this;
    }

    /**
     * <p>
     * The thing ID.
     * </p>
     * 
     * @param thingId
     *        The thing ID.
     */

    public void setThingId(String thingId) {
        this.thingId = thingId;
    }

    /**
     * <p>
     * The thing ID.
     * </p>
     * 
     * @return The thing ID.
     */

    public String getThingId() {
        return this.thingId;
    }

    /**
     * <p>
     * The thing ID.
     * </p>
     * 
     * @param thingId
     *        The thing ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateThingResult withThingId(String thingId) {
        setThingId(thingId);
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
        if (getThingArn() != null)
            sb.append("ThingArn: ").append(getThingArn()).append(",");
        if (getThingId() != null)
            sb.append("ThingId: ").append(getThingId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateThingResult == false)
            return false;
        CreateThingResult other = (CreateThingResult) obj;
        if (other.getThingName() == null ^ this.getThingName() == null)
            return false;
        if (other.getThingName() != null && other.getThingName().equals(this.getThingName()) == false)
            return false;
        if (other.getThingArn() == null ^ this.getThingArn() == null)
            return false;
        if (other.getThingArn() != null && other.getThingArn().equals(this.getThingArn()) == false)
            return false;
        if (other.getThingId() == null ^ this.getThingId() == null)
            return false;
        if (other.getThingId() != null && other.getThingId().equals(this.getThingId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getThingName() == null) ? 0 : getThingName().hashCode());
        hashCode = prime * hashCode + ((getThingArn() == null) ? 0 : getThingArn().hashCode());
        hashCode = prime * hashCode + ((getThingId() == null) ? 0 : getThingId().hashCode());
        return hashCode;
    }

    @Override
    public CreateThingResult clone() {
        try {
            return (CreateThingResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
