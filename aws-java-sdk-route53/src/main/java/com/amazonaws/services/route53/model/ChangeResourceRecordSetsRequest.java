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
package com.amazonaws.services.route53.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A complex type that contains change information for the resource record set.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ChangeResourceRecordSets" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChangeResourceRecordSetsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the hosted zone that contains the resource record sets that you want to change.
     * </p>
     */
    private String hostedZoneId;
    /**
     * <p>
     * A complex type that contains an optional comment and the <code>Changes</code> element.
     * </p>
     */
    private ChangeBatch changeBatch;

    /**
     * Default constructor for ChangeResourceRecordSetsRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize the object after creating it.
     */
    public ChangeResourceRecordSetsRequest() {
    }

    /**
     * Constructs a new ChangeResourceRecordSetsRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param hostedZoneId
     *        The ID of the hosted zone that contains the resource record sets that you want to change.
     * @param changeBatch
     *        A complex type that contains an optional comment and the <code>Changes</code> element.
     */
    public ChangeResourceRecordSetsRequest(String hostedZoneId, ChangeBatch changeBatch) {
        setHostedZoneId(hostedZoneId);
        setChangeBatch(changeBatch);
    }

    /**
     * <p>
     * The ID of the hosted zone that contains the resource record sets that you want to change.
     * </p>
     * 
     * @param hostedZoneId
     *        The ID of the hosted zone that contains the resource record sets that you want to change.
     */

    public void setHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
    }

    /**
     * <p>
     * The ID of the hosted zone that contains the resource record sets that you want to change.
     * </p>
     * 
     * @return The ID of the hosted zone that contains the resource record sets that you want to change.
     */

    public String getHostedZoneId() {
        return this.hostedZoneId;
    }

    /**
     * <p>
     * The ID of the hosted zone that contains the resource record sets that you want to change.
     * </p>
     * 
     * @param hostedZoneId
     *        The ID of the hosted zone that contains the resource record sets that you want to change.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangeResourceRecordSetsRequest withHostedZoneId(String hostedZoneId) {
        setHostedZoneId(hostedZoneId);
        return this;
    }

    /**
     * <p>
     * A complex type that contains an optional comment and the <code>Changes</code> element.
     * </p>
     * 
     * @param changeBatch
     *        A complex type that contains an optional comment and the <code>Changes</code> element.
     */

    public void setChangeBatch(ChangeBatch changeBatch) {
        this.changeBatch = changeBatch;
    }

    /**
     * <p>
     * A complex type that contains an optional comment and the <code>Changes</code> element.
     * </p>
     * 
     * @return A complex type that contains an optional comment and the <code>Changes</code> element.
     */

    public ChangeBatch getChangeBatch() {
        return this.changeBatch;
    }

    /**
     * <p>
     * A complex type that contains an optional comment and the <code>Changes</code> element.
     * </p>
     * 
     * @param changeBatch
     *        A complex type that contains an optional comment and the <code>Changes</code> element.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangeResourceRecordSetsRequest withChangeBatch(ChangeBatch changeBatch) {
        setChangeBatch(changeBatch);
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
        if (getHostedZoneId() != null)
            sb.append("HostedZoneId: ").append(getHostedZoneId()).append(",");
        if (getChangeBatch() != null)
            sb.append("ChangeBatch: ").append(getChangeBatch());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChangeResourceRecordSetsRequest == false)
            return false;
        ChangeResourceRecordSetsRequest other = (ChangeResourceRecordSetsRequest) obj;
        if (other.getHostedZoneId() == null ^ this.getHostedZoneId() == null)
            return false;
        if (other.getHostedZoneId() != null && other.getHostedZoneId().equals(this.getHostedZoneId()) == false)
            return false;
        if (other.getChangeBatch() == null ^ this.getChangeBatch() == null)
            return false;
        if (other.getChangeBatch() != null && other.getChangeBatch().equals(this.getChangeBatch()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHostedZoneId() == null) ? 0 : getHostedZoneId().hashCode());
        hashCode = prime * hashCode + ((getChangeBatch() == null) ? 0 : getChangeBatch().hashCode());
        return hashCode;
    }

    @Override
    public ChangeResourceRecordSetsRequest clone() {
        return (ChangeResourceRecordSetsRequest) super.clone();
    }

}
