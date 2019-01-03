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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/CreateReusableDelegationSet"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateReusableDelegationSetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique string that identifies the request, and that allows you to retry failed
     * <code>CreateReusableDelegationSet</code> requests without the risk of executing the operation twice. You must use
     * a unique <code>CallerReference</code> string every time you submit a <code>CreateReusableDelegationSet</code>
     * request. <code>CallerReference</code> can be any unique string, for example a date/time stamp.
     * </p>
     */
    private String callerReference;
    /**
     * <p>
     * If you want to mark the delegation set for an existing hosted zone as reusable, the ID for that hosted zone.
     * </p>
     */
    private String hostedZoneId;

    /**
     * <p>
     * A unique string that identifies the request, and that allows you to retry failed
     * <code>CreateReusableDelegationSet</code> requests without the risk of executing the operation twice. You must use
     * a unique <code>CallerReference</code> string every time you submit a <code>CreateReusableDelegationSet</code>
     * request. <code>CallerReference</code> can be any unique string, for example a date/time stamp.
     * </p>
     * 
     * @param callerReference
     *        A unique string that identifies the request, and that allows you to retry failed
     *        <code>CreateReusableDelegationSet</code> requests without the risk of executing the operation twice. You
     *        must use a unique <code>CallerReference</code> string every time you submit a
     *        <code>CreateReusableDelegationSet</code> request. <code>CallerReference</code> can be any unique string,
     *        for example a date/time stamp.
     */

    public void setCallerReference(String callerReference) {
        this.callerReference = callerReference;
    }

    /**
     * <p>
     * A unique string that identifies the request, and that allows you to retry failed
     * <code>CreateReusableDelegationSet</code> requests without the risk of executing the operation twice. You must use
     * a unique <code>CallerReference</code> string every time you submit a <code>CreateReusableDelegationSet</code>
     * request. <code>CallerReference</code> can be any unique string, for example a date/time stamp.
     * </p>
     * 
     * @return A unique string that identifies the request, and that allows you to retry failed
     *         <code>CreateReusableDelegationSet</code> requests without the risk of executing the operation twice. You
     *         must use a unique <code>CallerReference</code> string every time you submit a
     *         <code>CreateReusableDelegationSet</code> request. <code>CallerReference</code> can be any unique string,
     *         for example a date/time stamp.
     */

    public String getCallerReference() {
        return this.callerReference;
    }

    /**
     * <p>
     * A unique string that identifies the request, and that allows you to retry failed
     * <code>CreateReusableDelegationSet</code> requests without the risk of executing the operation twice. You must use
     * a unique <code>CallerReference</code> string every time you submit a <code>CreateReusableDelegationSet</code>
     * request. <code>CallerReference</code> can be any unique string, for example a date/time stamp.
     * </p>
     * 
     * @param callerReference
     *        A unique string that identifies the request, and that allows you to retry failed
     *        <code>CreateReusableDelegationSet</code> requests without the risk of executing the operation twice. You
     *        must use a unique <code>CallerReference</code> string every time you submit a
     *        <code>CreateReusableDelegationSet</code> request. <code>CallerReference</code> can be any unique string,
     *        for example a date/time stamp.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReusableDelegationSetRequest withCallerReference(String callerReference) {
        setCallerReference(callerReference);
        return this;
    }

    /**
     * <p>
     * If you want to mark the delegation set for an existing hosted zone as reusable, the ID for that hosted zone.
     * </p>
     * 
     * @param hostedZoneId
     *        If you want to mark the delegation set for an existing hosted zone as reusable, the ID for that hosted
     *        zone.
     */

    public void setHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
    }

    /**
     * <p>
     * If you want to mark the delegation set for an existing hosted zone as reusable, the ID for that hosted zone.
     * </p>
     * 
     * @return If you want to mark the delegation set for an existing hosted zone as reusable, the ID for that hosted
     *         zone.
     */

    public String getHostedZoneId() {
        return this.hostedZoneId;
    }

    /**
     * <p>
     * If you want to mark the delegation set for an existing hosted zone as reusable, the ID for that hosted zone.
     * </p>
     * 
     * @param hostedZoneId
     *        If you want to mark the delegation set for an existing hosted zone as reusable, the ID for that hosted
     *        zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReusableDelegationSetRequest withHostedZoneId(String hostedZoneId) {
        setHostedZoneId(hostedZoneId);
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
        if (getCallerReference() != null)
            sb.append("CallerReference: ").append(getCallerReference()).append(",");
        if (getHostedZoneId() != null)
            sb.append("HostedZoneId: ").append(getHostedZoneId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateReusableDelegationSetRequest == false)
            return false;
        CreateReusableDelegationSetRequest other = (CreateReusableDelegationSetRequest) obj;
        if (other.getCallerReference() == null ^ this.getCallerReference() == null)
            return false;
        if (other.getCallerReference() != null && other.getCallerReference().equals(this.getCallerReference()) == false)
            return false;
        if (other.getHostedZoneId() == null ^ this.getHostedZoneId() == null)
            return false;
        if (other.getHostedZoneId() != null && other.getHostedZoneId().equals(this.getHostedZoneId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCallerReference() == null) ? 0 : getCallerReference().hashCode());
        hashCode = prime * hashCode + ((getHostedZoneId() == null) ? 0 : getHostedZoneId().hashCode());
        return hashCode;
    }

    @Override
    public CreateReusableDelegationSetRequest clone() {
        return (CreateReusableDelegationSetRequest) super.clone();
    }

}
