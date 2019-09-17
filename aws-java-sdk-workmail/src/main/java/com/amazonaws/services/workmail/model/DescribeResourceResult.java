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
package com.amazonaws.services.workmail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DescribeResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeResourceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the described resource.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The email of the described resource.
     * </p>
     */
    private String email;
    /**
     * <p>
     * The name of the described resource.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The type of the described resource.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The booking options for the described resource.
     * </p>
     */
    private BookingOptions bookingOptions;
    /**
     * <p>
     * The state of the resource: enabled (registered to Amazon WorkMail) or disabled (deregistered or never registered
     * to WorkMail).
     * </p>
     */
    private String state;
    /**
     * <p>
     * The date and time when a resource was enabled for WorkMail, in UNIX epoch time format.
     * </p>
     */
    private java.util.Date enabledDate;
    /**
     * <p>
     * The date and time when a resource was disabled from WorkMail, in UNIX epoch time format.
     * </p>
     */
    private java.util.Date disabledDate;

    /**
     * <p>
     * The identifier of the described resource.
     * </p>
     * 
     * @param resourceId
     *        The identifier of the described resource.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The identifier of the described resource.
     * </p>
     * 
     * @return The identifier of the described resource.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The identifier of the described resource.
     * </p>
     * 
     * @param resourceId
     *        The identifier of the described resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeResourceResult withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The email of the described resource.
     * </p>
     * 
     * @param email
     *        The email of the described resource.
     */

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * <p>
     * The email of the described resource.
     * </p>
     * 
     * @return The email of the described resource.
     */

    public String getEmail() {
        return this.email;
    }

    /**
     * <p>
     * The email of the described resource.
     * </p>
     * 
     * @param email
     *        The email of the described resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeResourceResult withEmail(String email) {
        setEmail(email);
        return this;
    }

    /**
     * <p>
     * The name of the described resource.
     * </p>
     * 
     * @param name
     *        The name of the described resource.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the described resource.
     * </p>
     * 
     * @return The name of the described resource.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the described resource.
     * </p>
     * 
     * @param name
     *        The name of the described resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeResourceResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The type of the described resource.
     * </p>
     * 
     * @param type
     *        The type of the described resource.
     * @see ResourceType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the described resource.
     * </p>
     * 
     * @return The type of the described resource.
     * @see ResourceType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the described resource.
     * </p>
     * 
     * @param type
     *        The type of the described resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public DescribeResourceResult withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the described resource.
     * </p>
     * 
     * @param type
     *        The type of the described resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public DescribeResourceResult withType(ResourceType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The booking options for the described resource.
     * </p>
     * 
     * @param bookingOptions
     *        The booking options for the described resource.
     */

    public void setBookingOptions(BookingOptions bookingOptions) {
        this.bookingOptions = bookingOptions;
    }

    /**
     * <p>
     * The booking options for the described resource.
     * </p>
     * 
     * @return The booking options for the described resource.
     */

    public BookingOptions getBookingOptions() {
        return this.bookingOptions;
    }

    /**
     * <p>
     * The booking options for the described resource.
     * </p>
     * 
     * @param bookingOptions
     *        The booking options for the described resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeResourceResult withBookingOptions(BookingOptions bookingOptions) {
        setBookingOptions(bookingOptions);
        return this;
    }

    /**
     * <p>
     * The state of the resource: enabled (registered to Amazon WorkMail) or disabled (deregistered or never registered
     * to WorkMail).
     * </p>
     * 
     * @param state
     *        The state of the resource: enabled (registered to Amazon WorkMail) or disabled (deregistered or never
     *        registered to WorkMail).
     * @see EntityState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the resource: enabled (registered to Amazon WorkMail) or disabled (deregistered or never registered
     * to WorkMail).
     * </p>
     * 
     * @return The state of the resource: enabled (registered to Amazon WorkMail) or disabled (deregistered or never
     *         registered to WorkMail).
     * @see EntityState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the resource: enabled (registered to Amazon WorkMail) or disabled (deregistered or never registered
     * to WorkMail).
     * </p>
     * 
     * @param state
     *        The state of the resource: enabled (registered to Amazon WorkMail) or disabled (deregistered or never
     *        registered to WorkMail).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EntityState
     */

    public DescribeResourceResult withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the resource: enabled (registered to Amazon WorkMail) or disabled (deregistered or never registered
     * to WorkMail).
     * </p>
     * 
     * @param state
     *        The state of the resource: enabled (registered to Amazon WorkMail) or disabled (deregistered or never
     *        registered to WorkMail).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EntityState
     */

    public DescribeResourceResult withState(EntityState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The date and time when a resource was enabled for WorkMail, in UNIX epoch time format.
     * </p>
     * 
     * @param enabledDate
     *        The date and time when a resource was enabled for WorkMail, in UNIX epoch time format.
     */

    public void setEnabledDate(java.util.Date enabledDate) {
        this.enabledDate = enabledDate;
    }

    /**
     * <p>
     * The date and time when a resource was enabled for WorkMail, in UNIX epoch time format.
     * </p>
     * 
     * @return The date and time when a resource was enabled for WorkMail, in UNIX epoch time format.
     */

    public java.util.Date getEnabledDate() {
        return this.enabledDate;
    }

    /**
     * <p>
     * The date and time when a resource was enabled for WorkMail, in UNIX epoch time format.
     * </p>
     * 
     * @param enabledDate
     *        The date and time when a resource was enabled for WorkMail, in UNIX epoch time format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeResourceResult withEnabledDate(java.util.Date enabledDate) {
        setEnabledDate(enabledDate);
        return this;
    }

    /**
     * <p>
     * The date and time when a resource was disabled from WorkMail, in UNIX epoch time format.
     * </p>
     * 
     * @param disabledDate
     *        The date and time when a resource was disabled from WorkMail, in UNIX epoch time format.
     */

    public void setDisabledDate(java.util.Date disabledDate) {
        this.disabledDate = disabledDate;
    }

    /**
     * <p>
     * The date and time when a resource was disabled from WorkMail, in UNIX epoch time format.
     * </p>
     * 
     * @return The date and time when a resource was disabled from WorkMail, in UNIX epoch time format.
     */

    public java.util.Date getDisabledDate() {
        return this.disabledDate;
    }

    /**
     * <p>
     * The date and time when a resource was disabled from WorkMail, in UNIX epoch time format.
     * </p>
     * 
     * @param disabledDate
     *        The date and time when a resource was disabled from WorkMail, in UNIX epoch time format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeResourceResult withDisabledDate(java.util.Date disabledDate) {
        setDisabledDate(disabledDate);
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
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getEmail() != null)
            sb.append("Email: ").append(getEmail()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getBookingOptions() != null)
            sb.append("BookingOptions: ").append(getBookingOptions()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getEnabledDate() != null)
            sb.append("EnabledDate: ").append(getEnabledDate()).append(",");
        if (getDisabledDate() != null)
            sb.append("DisabledDate: ").append(getDisabledDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeResourceResult == false)
            return false;
        DescribeResourceResult other = (DescribeResourceResult) obj;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getEmail() == null ^ this.getEmail() == null)
            return false;
        if (other.getEmail() != null && other.getEmail().equals(this.getEmail()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getBookingOptions() == null ^ this.getBookingOptions() == null)
            return false;
        if (other.getBookingOptions() != null && other.getBookingOptions().equals(this.getBookingOptions()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getEnabledDate() == null ^ this.getEnabledDate() == null)
            return false;
        if (other.getEnabledDate() != null && other.getEnabledDate().equals(this.getEnabledDate()) == false)
            return false;
        if (other.getDisabledDate() == null ^ this.getDisabledDate() == null)
            return false;
        if (other.getDisabledDate() != null && other.getDisabledDate().equals(this.getDisabledDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getEmail() == null) ? 0 : getEmail().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getBookingOptions() == null) ? 0 : getBookingOptions().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getEnabledDate() == null) ? 0 : getEnabledDate().hashCode());
        hashCode = prime * hashCode + ((getDisabledDate() == null) ? 0 : getDisabledDate().hashCode());
        return hashCode;
    }

    @Override
    public DescribeResourceResult clone() {
        try {
            return (DescribeResourceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
