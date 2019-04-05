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
package com.amazonaws.services.cloudtrail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The request that specifies the name of a trail to delete.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/DeleteTrail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteTrailRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the name or the CloudTrail ARN of the trail to be deleted. The format of a trail ARN is:
     * <code>arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail</code>
     * </p>
     */
    private String name;

    /**
     * <p>
     * Specifies the name or the CloudTrail ARN of the trail to be deleted. The format of a trail ARN is:
     * <code>arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail</code>
     * </p>
     * 
     * @param name
     *        Specifies the name or the CloudTrail ARN of the trail to be deleted. The format of a trail ARN is:
     *        <code>arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail</code>
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Specifies the name or the CloudTrail ARN of the trail to be deleted. The format of a trail ARN is:
     * <code>arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail</code>
     * </p>
     * 
     * @return Specifies the name or the CloudTrail ARN of the trail to be deleted. The format of a trail ARN is:
     *         <code>arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail</code>
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Specifies the name or the CloudTrail ARN of the trail to be deleted. The format of a trail ARN is:
     * <code>arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail</code>
     * </p>
     * 
     * @param name
     *        Specifies the name or the CloudTrail ARN of the trail to be deleted. The format of a trail ARN is:
     *        <code>arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteTrailRequest withName(String name) {
        setName(name);
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
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteTrailRequest == false)
            return false;
        DeleteTrailRequest other = (DeleteTrailRequest) obj;
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
    public DeleteTrailRequest clone() {
        return (DeleteTrailRequest) super.clone();
    }

}
