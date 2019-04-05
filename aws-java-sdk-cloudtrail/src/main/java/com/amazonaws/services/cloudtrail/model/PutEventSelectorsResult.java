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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/PutEventSelectors" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutEventSelectorsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the ARN of the trail that was updated with event selectors. The format of a trail ARN is:
     * </p>
     * <p>
     * <code>arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail</code>
     * </p>
     */
    private String trailARN;
    /**
     * <p>
     * Specifies the event selectors configured for your trail.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<EventSelector> eventSelectors;

    /**
     * <p>
     * Specifies the ARN of the trail that was updated with event selectors. The format of a trail ARN is:
     * </p>
     * <p>
     * <code>arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail</code>
     * </p>
     * 
     * @param trailARN
     *        Specifies the ARN of the trail that was updated with event selectors. The format of a trail ARN is:</p>
     *        <p>
     *        <code>arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail</code>
     */

    public void setTrailARN(String trailARN) {
        this.trailARN = trailARN;
    }

    /**
     * <p>
     * Specifies the ARN of the trail that was updated with event selectors. The format of a trail ARN is:
     * </p>
     * <p>
     * <code>arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail</code>
     * </p>
     * 
     * @return Specifies the ARN of the trail that was updated with event selectors. The format of a trail ARN is:</p>
     *         <p>
     *         <code>arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail</code>
     */

    public String getTrailARN() {
        return this.trailARN;
    }

    /**
     * <p>
     * Specifies the ARN of the trail that was updated with event selectors. The format of a trail ARN is:
     * </p>
     * <p>
     * <code>arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail</code>
     * </p>
     * 
     * @param trailARN
     *        Specifies the ARN of the trail that was updated with event selectors. The format of a trail ARN is:</p>
     *        <p>
     *        <code>arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutEventSelectorsResult withTrailARN(String trailARN) {
        setTrailARN(trailARN);
        return this;
    }

    /**
     * <p>
     * Specifies the event selectors configured for your trail.
     * </p>
     * 
     * @return Specifies the event selectors configured for your trail.
     */

    public java.util.List<EventSelector> getEventSelectors() {
        if (eventSelectors == null) {
            eventSelectors = new com.amazonaws.internal.SdkInternalList<EventSelector>();
        }
        return eventSelectors;
    }

    /**
     * <p>
     * Specifies the event selectors configured for your trail.
     * </p>
     * 
     * @param eventSelectors
     *        Specifies the event selectors configured for your trail.
     */

    public void setEventSelectors(java.util.Collection<EventSelector> eventSelectors) {
        if (eventSelectors == null) {
            this.eventSelectors = null;
            return;
        }

        this.eventSelectors = new com.amazonaws.internal.SdkInternalList<EventSelector>(eventSelectors);
    }

    /**
     * <p>
     * Specifies the event selectors configured for your trail.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEventSelectors(java.util.Collection)} or {@link #withEventSelectors(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param eventSelectors
     *        Specifies the event selectors configured for your trail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutEventSelectorsResult withEventSelectors(EventSelector... eventSelectors) {
        if (this.eventSelectors == null) {
            setEventSelectors(new com.amazonaws.internal.SdkInternalList<EventSelector>(eventSelectors.length));
        }
        for (EventSelector ele : eventSelectors) {
            this.eventSelectors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the event selectors configured for your trail.
     * </p>
     * 
     * @param eventSelectors
     *        Specifies the event selectors configured for your trail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutEventSelectorsResult withEventSelectors(java.util.Collection<EventSelector> eventSelectors) {
        setEventSelectors(eventSelectors);
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
        if (getTrailARN() != null)
            sb.append("TrailARN: ").append(getTrailARN()).append(",");
        if (getEventSelectors() != null)
            sb.append("EventSelectors: ").append(getEventSelectors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutEventSelectorsResult == false)
            return false;
        PutEventSelectorsResult other = (PutEventSelectorsResult) obj;
        if (other.getTrailARN() == null ^ this.getTrailARN() == null)
            return false;
        if (other.getTrailARN() != null && other.getTrailARN().equals(this.getTrailARN()) == false)
            return false;
        if (other.getEventSelectors() == null ^ this.getEventSelectors() == null)
            return false;
        if (other.getEventSelectors() != null && other.getEventSelectors().equals(this.getEventSelectors()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTrailARN() == null) ? 0 : getTrailARN().hashCode());
        hashCode = prime * hashCode + ((getEventSelectors() == null) ? 0 : getEventSelectors().hashCode());
        return hashCode;
    }

    @Override
    public PutEventSelectorsResult clone() {
        try {
            return (PutEventSelectorsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
