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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/PutEventSelectors" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutEventSelectorsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the name of the trail or trail ARN. If you specify a trail name, the string must meet the following
     * requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Contain only ASCII letters (a-z, A-Z), numbers (0-9), periods (.), underscores (_), or dashes (-)
     * </p>
     * </li>
     * <li>
     * <p>
     * Start with a letter or number, and end with a letter or number
     * </p>
     * </li>
     * <li>
     * <p>
     * Be between 3 and 128 characters
     * </p>
     * </li>
     * <li>
     * <p>
     * Have no adjacent periods, underscores or dashes. Names like <code>my-_namespace</code> and
     * <code>my--namespace</code> are invalid.
     * </p>
     * </li>
     * <li>
     * <p>
     * Not be in IP address format (for example, 192.168.5.4)
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify a trail ARN, it must be in the format:
     * </p>
     * <p>
     * <code>arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail</code>
     * </p>
     */
    private String trailName;
    /**
     * <p>
     * Specifies the settings for your event selectors. You can configure up to five event selectors for a trail.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<EventSelector> eventSelectors;

    /**
     * <p>
     * Specifies the name of the trail or trail ARN. If you specify a trail name, the string must meet the following
     * requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Contain only ASCII letters (a-z, A-Z), numbers (0-9), periods (.), underscores (_), or dashes (-)
     * </p>
     * </li>
     * <li>
     * <p>
     * Start with a letter or number, and end with a letter or number
     * </p>
     * </li>
     * <li>
     * <p>
     * Be between 3 and 128 characters
     * </p>
     * </li>
     * <li>
     * <p>
     * Have no adjacent periods, underscores or dashes. Names like <code>my-_namespace</code> and
     * <code>my--namespace</code> are invalid.
     * </p>
     * </li>
     * <li>
     * <p>
     * Not be in IP address format (for example, 192.168.5.4)
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify a trail ARN, it must be in the format:
     * </p>
     * <p>
     * <code>arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail</code>
     * </p>
     * 
     * @param trailName
     *        Specifies the name of the trail or trail ARN. If you specify a trail name, the string must meet the
     *        following requirements:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Contain only ASCII letters (a-z, A-Z), numbers (0-9), periods (.), underscores (_), or dashes (-)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Start with a letter or number, and end with a letter or number
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Be between 3 and 128 characters
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Have no adjacent periods, underscores or dashes. Names like <code>my-_namespace</code> and
     *        <code>my--namespace</code> are invalid.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Not be in IP address format (for example, 192.168.5.4)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you specify a trail ARN, it must be in the format:
     *        </p>
     *        <p>
     *        <code>arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail</code>
     */

    public void setTrailName(String trailName) {
        this.trailName = trailName;
    }

    /**
     * <p>
     * Specifies the name of the trail or trail ARN. If you specify a trail name, the string must meet the following
     * requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Contain only ASCII letters (a-z, A-Z), numbers (0-9), periods (.), underscores (_), or dashes (-)
     * </p>
     * </li>
     * <li>
     * <p>
     * Start with a letter or number, and end with a letter or number
     * </p>
     * </li>
     * <li>
     * <p>
     * Be between 3 and 128 characters
     * </p>
     * </li>
     * <li>
     * <p>
     * Have no adjacent periods, underscores or dashes. Names like <code>my-_namespace</code> and
     * <code>my--namespace</code> are invalid.
     * </p>
     * </li>
     * <li>
     * <p>
     * Not be in IP address format (for example, 192.168.5.4)
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify a trail ARN, it must be in the format:
     * </p>
     * <p>
     * <code>arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail</code>
     * </p>
     * 
     * @return Specifies the name of the trail or trail ARN. If you specify a trail name, the string must meet the
     *         following requirements:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Contain only ASCII letters (a-z, A-Z), numbers (0-9), periods (.), underscores (_), or dashes (-)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Start with a letter or number, and end with a letter or number
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Be between 3 and 128 characters
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Have no adjacent periods, underscores or dashes. Names like <code>my-_namespace</code> and
     *         <code>my--namespace</code> are invalid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Not be in IP address format (for example, 192.168.5.4)
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you specify a trail ARN, it must be in the format:
     *         </p>
     *         <p>
     *         <code>arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail</code>
     */

    public String getTrailName() {
        return this.trailName;
    }

    /**
     * <p>
     * Specifies the name of the trail or trail ARN. If you specify a trail name, the string must meet the following
     * requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Contain only ASCII letters (a-z, A-Z), numbers (0-9), periods (.), underscores (_), or dashes (-)
     * </p>
     * </li>
     * <li>
     * <p>
     * Start with a letter or number, and end with a letter or number
     * </p>
     * </li>
     * <li>
     * <p>
     * Be between 3 and 128 characters
     * </p>
     * </li>
     * <li>
     * <p>
     * Have no adjacent periods, underscores or dashes. Names like <code>my-_namespace</code> and
     * <code>my--namespace</code> are invalid.
     * </p>
     * </li>
     * <li>
     * <p>
     * Not be in IP address format (for example, 192.168.5.4)
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify a trail ARN, it must be in the format:
     * </p>
     * <p>
     * <code>arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail</code>
     * </p>
     * 
     * @param trailName
     *        Specifies the name of the trail or trail ARN. If you specify a trail name, the string must meet the
     *        following requirements:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Contain only ASCII letters (a-z, A-Z), numbers (0-9), periods (.), underscores (_), or dashes (-)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Start with a letter or number, and end with a letter or number
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Be between 3 and 128 characters
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Have no adjacent periods, underscores or dashes. Names like <code>my-_namespace</code> and
     *        <code>my--namespace</code> are invalid.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Not be in IP address format (for example, 192.168.5.4)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you specify a trail ARN, it must be in the format:
     *        </p>
     *        <p>
     *        <code>arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutEventSelectorsRequest withTrailName(String trailName) {
        setTrailName(trailName);
        return this;
    }

    /**
     * <p>
     * Specifies the settings for your event selectors. You can configure up to five event selectors for a trail.
     * </p>
     * 
     * @return Specifies the settings for your event selectors. You can configure up to five event selectors for a
     *         trail.
     */

    public java.util.List<EventSelector> getEventSelectors() {
        if (eventSelectors == null) {
            eventSelectors = new com.amazonaws.internal.SdkInternalList<EventSelector>();
        }
        return eventSelectors;
    }

    /**
     * <p>
     * Specifies the settings for your event selectors. You can configure up to five event selectors for a trail.
     * </p>
     * 
     * @param eventSelectors
     *        Specifies the settings for your event selectors. You can configure up to five event selectors for a trail.
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
     * Specifies the settings for your event selectors. You can configure up to five event selectors for a trail.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEventSelectors(java.util.Collection)} or {@link #withEventSelectors(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param eventSelectors
     *        Specifies the settings for your event selectors. You can configure up to five event selectors for a trail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutEventSelectorsRequest withEventSelectors(EventSelector... eventSelectors) {
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
     * Specifies the settings for your event selectors. You can configure up to five event selectors for a trail.
     * </p>
     * 
     * @param eventSelectors
     *        Specifies the settings for your event selectors. You can configure up to five event selectors for a trail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutEventSelectorsRequest withEventSelectors(java.util.Collection<EventSelector> eventSelectors) {
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
        if (getTrailName() != null)
            sb.append("TrailName: ").append(getTrailName()).append(",");
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

        if (obj instanceof PutEventSelectorsRequest == false)
            return false;
        PutEventSelectorsRequest other = (PutEventSelectorsRequest) obj;
        if (other.getTrailName() == null ^ this.getTrailName() == null)
            return false;
        if (other.getTrailName() != null && other.getTrailName().equals(this.getTrailName()) == false)
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

        hashCode = prime * hashCode + ((getTrailName() == null) ? 0 : getTrailName().hashCode());
        hashCode = prime * hashCode + ((getEventSelectors() == null) ? 0 : getEventSelectors().hashCode());
        return hashCode;
    }

    @Override
    public PutEventSelectorsRequest clone() {
        return (PutEventSelectorsRequest) super.clone();
    }

}
