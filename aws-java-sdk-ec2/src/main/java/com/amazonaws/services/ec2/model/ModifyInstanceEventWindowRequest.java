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
import com.amazonaws.services.ec2.model.transform.ModifyInstanceEventWindowRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyInstanceEventWindowRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<ModifyInstanceEventWindowRequest> {

    /**
     * <p>
     * The name of the event window.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ID of the event window.
     * </p>
     */
    private String instanceEventWindowId;
    /**
     * <p>
     * The time ranges of the event window.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<InstanceEventWindowTimeRangeRequest> timeRanges;
    /**
     * <p>
     * The cron expression of the event window, for example, <code>* 0-4,20-23 * * 1,5</code>.
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

    public ModifyInstanceEventWindowRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ID of the event window.
     * </p>
     * 
     * @param instanceEventWindowId
     *        The ID of the event window.
     */

    public void setInstanceEventWindowId(String instanceEventWindowId) {
        this.instanceEventWindowId = instanceEventWindowId;
    }

    /**
     * <p>
     * The ID of the event window.
     * </p>
     * 
     * @return The ID of the event window.
     */

    public String getInstanceEventWindowId() {
        return this.instanceEventWindowId;
    }

    /**
     * <p>
     * The ID of the event window.
     * </p>
     * 
     * @param instanceEventWindowId
     *        The ID of the event window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyInstanceEventWindowRequest withInstanceEventWindowId(String instanceEventWindowId) {
        setInstanceEventWindowId(instanceEventWindowId);
        return this;
    }

    /**
     * <p>
     * The time ranges of the event window.
     * </p>
     * 
     * @return The time ranges of the event window.
     */

    public java.util.List<InstanceEventWindowTimeRangeRequest> getTimeRanges() {
        if (timeRanges == null) {
            timeRanges = new com.amazonaws.internal.SdkInternalList<InstanceEventWindowTimeRangeRequest>();
        }
        return timeRanges;
    }

    /**
     * <p>
     * The time ranges of the event window.
     * </p>
     * 
     * @param timeRanges
     *        The time ranges of the event window.
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
     * The time ranges of the event window.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTimeRanges(java.util.Collection)} or {@link #withTimeRanges(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param timeRanges
     *        The time ranges of the event window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyInstanceEventWindowRequest withTimeRanges(InstanceEventWindowTimeRangeRequest... timeRanges) {
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
     * The time ranges of the event window.
     * </p>
     * 
     * @param timeRanges
     *        The time ranges of the event window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyInstanceEventWindowRequest withTimeRanges(java.util.Collection<InstanceEventWindowTimeRangeRequest> timeRanges) {
        setTimeRanges(timeRanges);
        return this;
    }

    /**
     * <p>
     * The cron expression of the event window, for example, <code>* 0-4,20-23 * * 1,5</code>.
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
     *        The cron expression of the event window, for example, <code>* 0-4,20-23 * * 1,5</code>.</p>
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
     * The cron expression of the event window, for example, <code>* 0-4,20-23 * * 1,5</code>.
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
     * @return The cron expression of the event window, for example, <code>* 0-4,20-23 * * 1,5</code>.</p>
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
     * The cron expression of the event window, for example, <code>* 0-4,20-23 * * 1,5</code>.
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
     *        The cron expression of the event window, for example, <code>* 0-4,20-23 * * 1,5</code>.</p>
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

    public ModifyInstanceEventWindowRequest withCronExpression(String cronExpression) {
        setCronExpression(cronExpression);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ModifyInstanceEventWindowRequest> getDryRunRequest() {
        Request<ModifyInstanceEventWindowRequest> request = new ModifyInstanceEventWindowRequestMarshaller().marshall(this);
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
        if (getInstanceEventWindowId() != null)
            sb.append("InstanceEventWindowId: ").append(getInstanceEventWindowId()).append(",");
        if (getTimeRanges() != null)
            sb.append("TimeRanges: ").append(getTimeRanges()).append(",");
        if (getCronExpression() != null)
            sb.append("CronExpression: ").append(getCronExpression());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyInstanceEventWindowRequest == false)
            return false;
        ModifyInstanceEventWindowRequest other = (ModifyInstanceEventWindowRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getInstanceEventWindowId() == null ^ this.getInstanceEventWindowId() == null)
            return false;
        if (other.getInstanceEventWindowId() != null && other.getInstanceEventWindowId().equals(this.getInstanceEventWindowId()) == false)
            return false;
        if (other.getTimeRanges() == null ^ this.getTimeRanges() == null)
            return false;
        if (other.getTimeRanges() != null && other.getTimeRanges().equals(this.getTimeRanges()) == false)
            return false;
        if (other.getCronExpression() == null ^ this.getCronExpression() == null)
            return false;
        if (other.getCronExpression() != null && other.getCronExpression().equals(this.getCronExpression()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getInstanceEventWindowId() == null) ? 0 : getInstanceEventWindowId().hashCode());
        hashCode = prime * hashCode + ((getTimeRanges() == null) ? 0 : getTimeRanges().hashCode());
        hashCode = prime * hashCode + ((getCronExpression() == null) ? 0 : getCronExpression().hashCode());
        return hashCode;
    }

    @Override
    public ModifyInstanceEventWindowRequest clone() {
        return (ModifyInstanceEventWindowRequest) super.clone();
    }
}
