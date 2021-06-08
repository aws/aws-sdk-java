/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudwatchevents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A <code>ReplayDestination</code> object that contains details about a replay.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/ReplayDestination" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplayDestination implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the event bus to replay event to. You can replay events only to the event bus specified to create the
     * archive.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * A list of ARNs for rules to replay events to.
     * </p>
     */
    private java.util.List<String> filterArns;

    /**
     * <p>
     * The ARN of the event bus to replay event to. You can replay events only to the event bus specified to create the
     * archive.
     * </p>
     * 
     * @param arn
     *        The ARN of the event bus to replay event to. You can replay events only to the event bus specified to
     *        create the archive.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the event bus to replay event to. You can replay events only to the event bus specified to create the
     * archive.
     * </p>
     * 
     * @return The ARN of the event bus to replay event to. You can replay events only to the event bus specified to
     *         create the archive.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the event bus to replay event to. You can replay events only to the event bus specified to create the
     * archive.
     * </p>
     * 
     * @param arn
     *        The ARN of the event bus to replay event to. You can replay events only to the event bus specified to
     *        create the archive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplayDestination withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * A list of ARNs for rules to replay events to.
     * </p>
     * 
     * @return A list of ARNs for rules to replay events to.
     */

    public java.util.List<String> getFilterArns() {
        return filterArns;
    }

    /**
     * <p>
     * A list of ARNs for rules to replay events to.
     * </p>
     * 
     * @param filterArns
     *        A list of ARNs for rules to replay events to.
     */

    public void setFilterArns(java.util.Collection<String> filterArns) {
        if (filterArns == null) {
            this.filterArns = null;
            return;
        }

        this.filterArns = new java.util.ArrayList<String>(filterArns);
    }

    /**
     * <p>
     * A list of ARNs for rules to replay events to.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilterArns(java.util.Collection)} or {@link #withFilterArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param filterArns
     *        A list of ARNs for rules to replay events to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplayDestination withFilterArns(String... filterArns) {
        if (this.filterArns == null) {
            setFilterArns(new java.util.ArrayList<String>(filterArns.length));
        }
        for (String ele : filterArns) {
            this.filterArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of ARNs for rules to replay events to.
     * </p>
     * 
     * @param filterArns
     *        A list of ARNs for rules to replay events to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplayDestination withFilterArns(java.util.Collection<String> filterArns) {
        setFilterArns(filterArns);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getFilterArns() != null)
            sb.append("FilterArns: ").append(getFilterArns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplayDestination == false)
            return false;
        ReplayDestination other = (ReplayDestination) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getFilterArns() == null ^ this.getFilterArns() == null)
            return false;
        if (other.getFilterArns() != null && other.getFilterArns().equals(this.getFilterArns()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getFilterArns() == null) ? 0 : getFilterArns().hashCode());
        return hashCode;
    }

    @Override
    public ReplayDestination clone() {
        try {
            return (ReplayDestination) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudwatchevents.model.transform.ReplayDestinationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
