/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.CreateInstanceEventWindowRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateInstanceEventWindowRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<CreateInstanceEventWindowRequest> {

    /**
     * <p>
     * The name of the event window.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The time range for the event window. If you specify a time range, you can't specify a cron expression.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<InstanceEventWindowTimeRangeRequest> timeRanges;
    /**
     * <p>
     * The cron expression for the event window, for example, <code>* 0-4,20-23 * * 1,5</code>. If you specify a cron
     * expression, you can't specify a time range.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Only hour and day of the week values are supported.
     * </p>
     * </li>
     * <li>
     * <p>
     * For day of the week values, you can specify either integers <code>0</code> through <code>6</code>, or alternative
     * single values <code>SUN</code> through <code>SAT</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The minute, month, and year must be specified by <code>*</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The hour value must be one or a multiple range, for example, <code>0-4</code> or <code>0-4,20-23</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each hour range must be &gt;= 2 hours, for example, <code>0-2</code> or <code>20-23</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The event window must be &gt;= 4 hours. The combined total time ranges in the event window must be &gt;= 4 hours.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about cron expressions, see <a href="https://en.wikipedia.org/wiki/Cron">cron</a> on the
     * <i>Wikipedia website</i>.
     * </p>
     */
    private String cronExpression;
    /**
     * <p>
     * The tags to apply to the event window.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TagSpecification> tagSpecifications;

    /**
     * <p>
     * The name of the event window.
     * </p>
     * 
     * @param name
     *        The name of the event window.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the event window.
     * </p>
     * 
     * @return The name of the event window.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the event window.
     * </p>
     * 
     * @param name
     *        The name of the event window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInstanceEventWindowRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The time range for the event window. If you specify a time range, you can't specify a cron expression.
     * </p>
     * 
     * @return The time range for the event window. If you specify a time range, you can't specify a cron expression.
     */

    public java.util.List<InstanceEventWindowTimeRangeRequest> getTimeRanges() {
        if (timeRanges == null) {
            timeRanges = new com.amazonaws.internal.SdkInternalList<InstanceEventWindowTimeRangeRequest>();
        }
        return timeRanges;
    }

    /**
     * <p>
     * The time range for the event window. If you specify a time range, you can't specify a cron expression.
     * </p>
     * 
     * @param timeRanges
     *        The time range for the event window. If you specify a time range, you can't specify a cron expression.
     */

    public void setTimeRanges(java.util.Collection<InstanceEventWindowTimeRangeRequest> timeRanges) {
        if (timeRanges == null) {
            this.timeRanges = null;
            return;
        }

        this.timeRanges = new com.amazonaws.internal.SdkInternalList<InstanceEventWindowTimeRangeRequest>(timeRanges);
    }

    /**
     * <p>
     * The time range for the event window. If you specify a time range, you can't specify a cron expression.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTimeRanges(java.util.Collection)} or {@link #withTimeRanges(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param timeRanges
     *        The time range for the event window. If you specify a time range, you can't specify a cron expression.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInstanceEventWindowRequest withTimeRanges(InstanceEventWindowTimeRangeRequest... timeRanges) {
        if (this.timeRanges == null) {
            setTimeRanges(new com.amazonaws.internal.SdkInternalList<InstanceEventWindowTimeRangeRequest>(timeRanges.length));
        }
        for (InstanceEventWindowTimeRangeRequest ele : timeRanges) {
            this.timeRanges.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The time range for the event window. If you specify a time range, you can't specify a cron expression.
     * </p>
     * 
     * @param timeRanges
     *        The time range for the event window. If you specify a time range, you can't specify a cron expression.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInstanceEventWindowRequest withTimeRanges(java.util.Collection<InstanceEventWindowTimeRangeRequest> timeRanges) {
        setTimeRanges(timeRanges);
        return this;
    }

    /**
     * <p>
     * The cron expression for the event window, for example, <code>* 0-4,20-23 * * 1,5</code>. If you specify a cron
     * expression, you can't specify a time range.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Only hour and day of the week values are supported.
     * </p>
     * </li>
     * <li>
     * <p>
     * For day of the week values, you can specify either integers <code>0</code> through <code>6</code>, or alternative
     * single values <code>SUN</code> through <code>SAT</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The minute, month, and year must be specified by <code>*</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The hour value must be one or a multiple range, for example, <code>0-4</code> or <code>0-4,20-23</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each hour range must be &gt;= 2 hours, for example, <code>0-2</code> or <code>20-23</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The event window must be &gt;= 4 hours. The combined total time ranges in the event window must be &gt;= 4 hours.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about cron expressions, see <a href="https://en.wikipedia.org/wiki/Cron">cron</a> on the
     * <i>Wikipedia website</i>.
     * </p>
     * 
     * @param cronExpression
     *        The cron expression for the event window, for example, <code>* 0-4,20-23 * * 1,5</code>. If you specify a
     *        cron expression, you can't specify a time range.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Only hour and day of the week values are supported.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For day of the week values, you can specify either integers <code>0</code> through <code>6</code>, or
     *        alternative single values <code>SUN</code> through <code>SAT</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The minute, month, and year must be specified by <code>*</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The hour value must be one or a multiple range, for example, <code>0-4</code> or <code>0-4,20-23</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Each hour range must be &gt;= 2 hours, for example, <code>0-2</code> or <code>20-23</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The event window must be &gt;= 4 hours. The combined total time ranges in the event window must be &gt;= 4
     *        hours.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about cron expressions, see <a href="https://en.wikipedia.org/wiki/Cron">cron</a> on
     *        the <i>Wikipedia website</i>.
     */

    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
    }

    /**
     * <p>
     * The cron expression for the event window, for example, <code>* 0-4,20-23 * * 1,5</code>. If you specify a cron
     * expression, you can't specify a time range.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Only hour and day of the week values are supported.
     * </p>
     * </li>
     * <li>
     * <p>
     * For day of the week values, you can specify either integers <code>0</code> through <code>6</code>, or alternative
     * single values <code>SUN</code> through <code>SAT</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The minute, month, and year must be specified by <code>*</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The hour value must be one or a multiple range, for example, <code>0-4</code> or <code>0-4,20-23</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each hour range must be &gt;= 2 hours, for example, <code>0-2</code> or <code>20-23</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The event window must be &gt;= 4 hours. The combined total time ranges in the event window must be &gt;= 4 hours.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about cron expressions, see <a href="https://en.wikipedia.org/wiki/Cron">cron</a> on the
     * <i>Wikipedia website</i>.
     * </p>
     * 
     * @return The cron expression for the event window, for example, <code>* 0-4,20-23 * * 1,5</code>. If you specify a
     *         cron expression, you can't specify a time range.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Only hour and day of the week values are supported.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For day of the week values, you can specify either integers <code>0</code> through <code>6</code>, or
     *         alternative single values <code>SUN</code> through <code>SAT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The minute, month, and year must be specified by <code>*</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The hour value must be one or a multiple range, for example, <code>0-4</code> or <code>0-4,20-23</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Each hour range must be &gt;= 2 hours, for example, <code>0-2</code> or <code>20-23</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The event window must be &gt;= 4 hours. The combined total time ranges in the event window must be &gt;=
     *         4 hours.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information about cron expressions, see <a href="https://en.wikipedia.org/wiki/Cron">cron</a> on
     *         the <i>Wikipedia website</i>.
     */

    public String getCronExpression() {
        return this.cronExpression;
    }

    /**
     * <p>
     * The cron expression for the event window, for example, <code>* 0-4,20-23 * * 1,5</code>. If you specify a cron
     * expression, you can't specify a time range.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Only hour and day of the week values are supported.
     * </p>
     * </li>
     * <li>
     * <p>
     * For day of the week values, you can specify either integers <code>0</code> through <code>6</code>, or alternative
     * single values <code>SUN</code> through <code>SAT</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The minute, month, and year must be specified by <code>*</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The hour value must be one or a multiple range, for example, <code>0-4</code> or <code>0-4,20-23</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each hour range must be &gt;= 2 hours, for example, <code>0-2</code> or <code>20-23</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The event window must be &gt;= 4 hours. The combined total time ranges in the event window must be &gt;= 4 hours.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about cron expressions, see <a href="https://en.wikipedia.org/wiki/Cron">cron</a> on the
     * <i>Wikipedia website</i>.
     * </p>
     * 
     * @param cronExpression
     *        The cron expression for the event window, for example, <code>* 0-4,20-23 * * 1,5</code>. If you specify a
     *        cron expression, you can't specify a time range.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Only hour and day of the week values are supported.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For day of the week values, you can specify either integers <code>0</code> through <code>6</code>, or
     *        alternative single values <code>SUN</code> through <code>SAT</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The minute, month, and year must be specified by <code>*</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The hour value must be one or a multiple range, for example, <code>0-4</code> or <code>0-4,20-23</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Each hour range must be &gt;= 2 hours, for example, <code>0-2</code> or <code>20-23</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The event window must be &gt;= 4 hours. The combined total time ranges in the event window must be &gt;= 4
     *        hours.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about cron expressions, see <a href="https://en.wikipedia.org/wiki/Cron">cron</a> on
     *        the <i>Wikipedia website</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInstanceEventWindowRequest withCronExpression(String cronExpression) {
        setCronExpression(cronExpression);
        return this;
    }

    /**
     * <p>
     * The tags to apply to the event window.
     * </p>
     * 
     * @return The tags to apply to the event window.
     */

    public java.util.List<TagSpecification> getTagSpecifications() {
        if (tagSpecifications == null) {
            tagSpecifications = new com.amazonaws.internal.SdkInternalList<TagSpecification>();
        }
        return tagSpecifications;
    }

    /**
     * <p>
     * The tags to apply to the event window.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to apply to the event window.
     */

    public void setTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        if (tagSpecifications == null) {
            this.tagSpecifications = null;
            return;
        }

        this.tagSpecifications = new com.amazonaws.internal.SdkInternalList<TagSpecification>(tagSpecifications);
    }

    /**
     * <p>
     * The tags to apply to the event window.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagSpecifications(java.util.Collection)} or {@link #withTagSpecifications(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to apply to the event window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInstanceEventWindowRequest withTagSpecifications(TagSpecification... tagSpecifications) {
        if (this.tagSpecifications == null) {
            setTagSpecifications(new com.amazonaws.internal.SdkInternalList<TagSpecification>(tagSpecifications.length));
        }
        for (TagSpecification ele : tagSpecifications) {
            this.tagSpecifications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags to apply to the event window.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to apply to the event window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInstanceEventWindowRequest withTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        setTagSpecifications(tagSpecifications);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<CreateInstanceEventWindowRequest> getDryRunRequest() {
        Request<CreateInstanceEventWindowRequest> request = new CreateInstanceEventWindowRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
            sb.append("Name: ").append(getName()).append(",");
        if (getTimeRanges() != null)
            sb.append("TimeRanges: ").append(getTimeRanges()).append(",");
        if (getCronExpression() != null)
            sb.append("CronExpression: ").append(getCronExpression()).append(",");
        if (getTagSpecifications() != null)
            sb.append("TagSpecifications: ").append(getTagSpecifications());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateInstanceEventWindowRequest == false)
            return false;
        CreateInstanceEventWindowRequest other = (CreateInstanceEventWindowRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTimeRanges() == null ^ this.getTimeRanges() == null)
            return false;
        if (other.getTimeRanges() != null && other.getTimeRanges().equals(this.getTimeRanges()) == false)
            return false;
        if (other.getCronExpression() == null ^ this.getCronExpression() == null)
            return false;
        if (other.getCronExpression() != null && other.getCronExpression().equals(this.getCronExpression()) == false)
            return false;
        if (other.getTagSpecifications() == null ^ this.getTagSpecifications() == null)
            return false;
        if (other.getTagSpecifications() != null && other.getTagSpecifications().equals(this.getTagSpecifications()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTimeRanges() == null) ? 0 : getTimeRanges().hashCode());
        hashCode = prime * hashCode + ((getCronExpression() == null) ? 0 : getCronExpression().hashCode());
        hashCode = prime * hashCode + ((getTagSpecifications() == null) ? 0 : getTagSpecifications().hashCode());
        return hashCode;
    }

    @Override
    public CreateInstanceEventWindowRequest clone() {
        return (CreateInstanceEventWindowRequest) super.clone();
    }
}
