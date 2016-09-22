/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudtrail.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The name of a trail about which you want the current status.
 * </p>
 */
public class GetTrailStatusRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the name or the CloudTrail ARN of the trail for which you are requesting status. To get the status of a
     * shadow trail (a replication of the trail in another region), you must specify its ARN. The format of a trail ARN
     * is:
     * </p>
     * <p>
     * <code>arn:aws:cloudtrail:us-east-1:123456789012:trail/MyTrail</code>
     * </p>
     */
    private String name;

    /**
     * <p>
     * Specifies the name or the CloudTrail ARN of the trail for which you are requesting status. To get the status of a
     * shadow trail (a replication of the trail in another region), you must specify its ARN. The format of a trail ARN
     * is:
     * </p>
     * <p>
     * <code>arn:aws:cloudtrail:us-east-1:123456789012:trail/MyTrail</code>
     * </p>
     * 
     * @param name
     *        Specifies the name or the CloudTrail ARN of the trail for which you are requesting status. To get the
     *        status of a shadow trail (a replication of the trail in another region), you must specify its ARN. The
     *        format of a trail ARN is:</p>
     *        <p>
     *        <code>arn:aws:cloudtrail:us-east-1:123456789012:trail/MyTrail</code>
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Specifies the name or the CloudTrail ARN of the trail for which you are requesting status. To get the status of a
     * shadow trail (a replication of the trail in another region), you must specify its ARN. The format of a trail ARN
     * is:
     * </p>
     * <p>
     * <code>arn:aws:cloudtrail:us-east-1:123456789012:trail/MyTrail</code>
     * </p>
     * 
     * @return Specifies the name or the CloudTrail ARN of the trail for which you are requesting status. To get the
     *         status of a shadow trail (a replication of the trail in another region), you must specify its ARN. The
     *         format of a trail ARN is:</p>
     *         <p>
     *         <code>arn:aws:cloudtrail:us-east-1:123456789012:trail/MyTrail</code>
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Specifies the name or the CloudTrail ARN of the trail for which you are requesting status. To get the status of a
     * shadow trail (a replication of the trail in another region), you must specify its ARN. The format of a trail ARN
     * is:
     * </p>
     * <p>
     * <code>arn:aws:cloudtrail:us-east-1:123456789012:trail/MyTrail</code>
     * </p>
     * 
     * @param name
     *        Specifies the name or the CloudTrail ARN of the trail for which you are requesting status. To get the
     *        status of a shadow trail (a replication of the trail in another region), you must specify its ARN. The
     *        format of a trail ARN is:</p>
     *        <p>
     *        <code>arn:aws:cloudtrail:us-east-1:123456789012:trail/MyTrail</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTrailStatusRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getName() != null)
            sb.append("Name: " + getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetTrailStatusRequest == false)
            return false;
        GetTrailStatusRequest other = (GetTrailStatusRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public GetTrailStatusRequest clone() {
        return (GetTrailStatusRequest) super.clone();
    }
}
