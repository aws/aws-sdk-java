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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.ReportInstanceStatusRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReportInstanceStatusRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<ReportInstanceStatusRequest> {

    /**
     * <p>
     * Descriptive text about the health state of your instance.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The time at which the reported instance health state ended.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The instances.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> instances;
    /**
     * <p>
     * The reason codes that describe the health state of your instance.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>instance-stuck-in-state</code>: My instance is stuck in a state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unresponsive</code>: My instance is unresponsive.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>not-accepting-credentials</code>: My instance is not accepting my credentials.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>password-not-available</code>: A password is not available for my instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>performance-network</code>: My instance is experiencing performance problems that I believe are network
     * related.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>performance-instance-store</code>: My instance is experiencing performance problems that I believe are
     * related to the instance stores.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>performance-ebs-volume</code>: My instance is experiencing performance problems that I believe are related
     * to an EBS volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>performance-other</code>: My instance is experiencing performance problems.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>other</code>: [explain using the description parameter]
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<String> reasonCodes;
    /**
     * <p>
     * The time at which the reported instance health state began.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The status of all instances listed.
     * </p>
     */
    private String status;

    /**
     * <p>
     * Descriptive text about the health state of your instance.
     * </p>
     * 
     * @param description
     *        Descriptive text about the health state of your instance.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Descriptive text about the health state of your instance.
     * </p>
     * 
     * @return Descriptive text about the health state of your instance.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Descriptive text about the health state of your instance.
     * </p>
     * 
     * @param description
     *        Descriptive text about the health state of your instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportInstanceStatusRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The time at which the reported instance health state ended.
     * </p>
     * 
     * @param endTime
     *        The time at which the reported instance health state ended.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The time at which the reported instance health state ended.
     * </p>
     * 
     * @return The time at which the reported instance health state ended.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The time at which the reported instance health state ended.
     * </p>
     * 
     * @param endTime
     *        The time at which the reported instance health state ended.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportInstanceStatusRequest withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The instances.
     * </p>
     * 
     * @return The instances.
     */

    public java.util.List<String> getInstances() {
        if (instances == null) {
            instances = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return instances;
    }

    /**
     * <p>
     * The instances.
     * </p>
     * 
     * @param instances
     *        The instances.
     */

    public void setInstances(java.util.Collection<String> instances) {
        if (instances == null) {
            this.instances = null;
            return;
        }

        this.instances = new com.amazonaws.internal.SdkInternalList<String>(instances);
    }

    /**
     * <p>
     * The instances.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstances(java.util.Collection)} or {@link #withInstances(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param instances
     *        The instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportInstanceStatusRequest withInstances(String... instances) {
        if (this.instances == null) {
            setInstances(new com.amazonaws.internal.SdkInternalList<String>(instances.length));
        }
        for (String ele : instances) {
            this.instances.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The instances.
     * </p>
     * 
     * @param instances
     *        The instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportInstanceStatusRequest withInstances(java.util.Collection<String> instances) {
        setInstances(instances);
        return this;
    }

    /**
     * <p>
     * The reason codes that describe the health state of your instance.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>instance-stuck-in-state</code>: My instance is stuck in a state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unresponsive</code>: My instance is unresponsive.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>not-accepting-credentials</code>: My instance is not accepting my credentials.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>password-not-available</code>: A password is not available for my instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>performance-network</code>: My instance is experiencing performance problems that I believe are network
     * related.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>performance-instance-store</code>: My instance is experiencing performance problems that I believe are
     * related to the instance stores.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>performance-ebs-volume</code>: My instance is experiencing performance problems that I believe are related
     * to an EBS volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>performance-other</code>: My instance is experiencing performance problems.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>other</code>: [explain using the description parameter]
     * </p>
     * </li>
     * </ul>
     * 
     * @return The reason codes that describe the health state of your instance.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>instance-stuck-in-state</code>: My instance is stuck in a state.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>unresponsive</code>: My instance is unresponsive.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>not-accepting-credentials</code>: My instance is not accepting my credentials.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>password-not-available</code>: A password is not available for my instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>performance-network</code>: My instance is experiencing performance problems that I believe are
     *         network related.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>performance-instance-store</code>: My instance is experiencing performance problems that I believe
     *         are related to the instance stores.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>performance-ebs-volume</code>: My instance is experiencing performance problems that I believe are
     *         related to an EBS volume.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>performance-other</code>: My instance is experiencing performance problems.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>other</code>: [explain using the description parameter]
     *         </p>
     *         </li>
     * @see ReportInstanceReasonCodes
     */

    public java.util.List<String> getReasonCodes() {
        if (reasonCodes == null) {
            reasonCodes = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return reasonCodes;
    }

    /**
     * <p>
     * The reason codes that describe the health state of your instance.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>instance-stuck-in-state</code>: My instance is stuck in a state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unresponsive</code>: My instance is unresponsive.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>not-accepting-credentials</code>: My instance is not accepting my credentials.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>password-not-available</code>: A password is not available for my instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>performance-network</code>: My instance is experiencing performance problems that I believe are network
     * related.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>performance-instance-store</code>: My instance is experiencing performance problems that I believe are
     * related to the instance stores.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>performance-ebs-volume</code>: My instance is experiencing performance problems that I believe are related
     * to an EBS volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>performance-other</code>: My instance is experiencing performance problems.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>other</code>: [explain using the description parameter]
     * </p>
     * </li>
     * </ul>
     * 
     * @param reasonCodes
     *        The reason codes that describe the health state of your instance.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>instance-stuck-in-state</code>: My instance is stuck in a state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>unresponsive</code>: My instance is unresponsive.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>not-accepting-credentials</code>: My instance is not accepting my credentials.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>password-not-available</code>: A password is not available for my instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>performance-network</code>: My instance is experiencing performance problems that I believe are
     *        network related.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>performance-instance-store</code>: My instance is experiencing performance problems that I believe
     *        are related to the instance stores.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>performance-ebs-volume</code>: My instance is experiencing performance problems that I believe are
     *        related to an EBS volume.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>performance-other</code>: My instance is experiencing performance problems.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>other</code>: [explain using the description parameter]
     *        </p>
     *        </li>
     * @see ReportInstanceReasonCodes
     */

    public void setReasonCodes(java.util.Collection<String> reasonCodes) {
        if (reasonCodes == null) {
            this.reasonCodes = null;
            return;
        }

        this.reasonCodes = new com.amazonaws.internal.SdkInternalList<String>(reasonCodes);
    }

    /**
     * <p>
     * The reason codes that describe the health state of your instance.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>instance-stuck-in-state</code>: My instance is stuck in a state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unresponsive</code>: My instance is unresponsive.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>not-accepting-credentials</code>: My instance is not accepting my credentials.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>password-not-available</code>: A password is not available for my instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>performance-network</code>: My instance is experiencing performance problems that I believe are network
     * related.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>performance-instance-store</code>: My instance is experiencing performance problems that I believe are
     * related to the instance stores.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>performance-ebs-volume</code>: My instance is experiencing performance problems that I believe are related
     * to an EBS volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>performance-other</code>: My instance is experiencing performance problems.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>other</code>: [explain using the description parameter]
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReasonCodes(java.util.Collection)} or {@link #withReasonCodes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param reasonCodes
     *        The reason codes that describe the health state of your instance.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>instance-stuck-in-state</code>: My instance is stuck in a state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>unresponsive</code>: My instance is unresponsive.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>not-accepting-credentials</code>: My instance is not accepting my credentials.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>password-not-available</code>: A password is not available for my instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>performance-network</code>: My instance is experiencing performance problems that I believe are
     *        network related.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>performance-instance-store</code>: My instance is experiencing performance problems that I believe
     *        are related to the instance stores.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>performance-ebs-volume</code>: My instance is experiencing performance problems that I believe are
     *        related to an EBS volume.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>performance-other</code>: My instance is experiencing performance problems.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>other</code>: [explain using the description parameter]
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReportInstanceReasonCodes
     */

    public ReportInstanceStatusRequest withReasonCodes(String... reasonCodes) {
        if (this.reasonCodes == null) {
            setReasonCodes(new com.amazonaws.internal.SdkInternalList<String>(reasonCodes.length));
        }
        for (String ele : reasonCodes) {
            this.reasonCodes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The reason codes that describe the health state of your instance.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>instance-stuck-in-state</code>: My instance is stuck in a state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unresponsive</code>: My instance is unresponsive.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>not-accepting-credentials</code>: My instance is not accepting my credentials.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>password-not-available</code>: A password is not available for my instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>performance-network</code>: My instance is experiencing performance problems that I believe are network
     * related.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>performance-instance-store</code>: My instance is experiencing performance problems that I believe are
     * related to the instance stores.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>performance-ebs-volume</code>: My instance is experiencing performance problems that I believe are related
     * to an EBS volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>performance-other</code>: My instance is experiencing performance problems.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>other</code>: [explain using the description parameter]
     * </p>
     * </li>
     * </ul>
     * 
     * @param reasonCodes
     *        The reason codes that describe the health state of your instance.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>instance-stuck-in-state</code>: My instance is stuck in a state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>unresponsive</code>: My instance is unresponsive.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>not-accepting-credentials</code>: My instance is not accepting my credentials.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>password-not-available</code>: A password is not available for my instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>performance-network</code>: My instance is experiencing performance problems that I believe are
     *        network related.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>performance-instance-store</code>: My instance is experiencing performance problems that I believe
     *        are related to the instance stores.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>performance-ebs-volume</code>: My instance is experiencing performance problems that I believe are
     *        related to an EBS volume.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>performance-other</code>: My instance is experiencing performance problems.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>other</code>: [explain using the description parameter]
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReportInstanceReasonCodes
     */

    public ReportInstanceStatusRequest withReasonCodes(java.util.Collection<String> reasonCodes) {
        setReasonCodes(reasonCodes);
        return this;
    }

    /**
     * <p>
     * The reason codes that describe the health state of your instance.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>instance-stuck-in-state</code>: My instance is stuck in a state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unresponsive</code>: My instance is unresponsive.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>not-accepting-credentials</code>: My instance is not accepting my credentials.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>password-not-available</code>: A password is not available for my instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>performance-network</code>: My instance is experiencing performance problems that I believe are network
     * related.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>performance-instance-store</code>: My instance is experiencing performance problems that I believe are
     * related to the instance stores.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>performance-ebs-volume</code>: My instance is experiencing performance problems that I believe are related
     * to an EBS volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>performance-other</code>: My instance is experiencing performance problems.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>other</code>: [explain using the description parameter]
     * </p>
     * </li>
     * </ul>
     * 
     * @param reasonCodes
     *        The reason codes that describe the health state of your instance.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>instance-stuck-in-state</code>: My instance is stuck in a state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>unresponsive</code>: My instance is unresponsive.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>not-accepting-credentials</code>: My instance is not accepting my credentials.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>password-not-available</code>: A password is not available for my instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>performance-network</code>: My instance is experiencing performance problems that I believe are
     *        network related.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>performance-instance-store</code>: My instance is experiencing performance problems that I believe
     *        are related to the instance stores.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>performance-ebs-volume</code>: My instance is experiencing performance problems that I believe are
     *        related to an EBS volume.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>performance-other</code>: My instance is experiencing performance problems.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>other</code>: [explain using the description parameter]
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReportInstanceReasonCodes
     */

    public ReportInstanceStatusRequest withReasonCodes(ReportInstanceReasonCodes... reasonCodes) {
        com.amazonaws.internal.SdkInternalList<String> reasonCodesCopy = new com.amazonaws.internal.SdkInternalList<String>(reasonCodes.length);
        for (ReportInstanceReasonCodes value : reasonCodes) {
            reasonCodesCopy.add(value.toString());
        }
        if (getReasonCodes() == null) {
            setReasonCodes(reasonCodesCopy);
        } else {
            getReasonCodes().addAll(reasonCodesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The time at which the reported instance health state began.
     * </p>
     * 
     * @param startTime
     *        The time at which the reported instance health state began.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The time at which the reported instance health state began.
     * </p>
     * 
     * @return The time at which the reported instance health state began.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The time at which the reported instance health state began.
     * </p>
     * 
     * @param startTime
     *        The time at which the reported instance health state began.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportInstanceStatusRequest withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The status of all instances listed.
     * </p>
     * 
     * @param status
     *        The status of all instances listed.
     * @see ReportStatusType
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of all instances listed.
     * </p>
     * 
     * @return The status of all instances listed.
     * @see ReportStatusType
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of all instances listed.
     * </p>
     * 
     * @param status
     *        The status of all instances listed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReportStatusType
     */

    public ReportInstanceStatusRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of all instances listed.
     * </p>
     * 
     * @param status
     *        The status of all instances listed.
     * @see ReportStatusType
     */

    public void setStatus(ReportStatusType status) {
        withStatus(status);
    }

    /**
     * <p>
     * The status of all instances listed.
     * </p>
     * 
     * @param status
     *        The status of all instances listed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReportStatusType
     */

    public ReportInstanceStatusRequest withStatus(ReportStatusType status) {
        this.status = status.toString();
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ReportInstanceStatusRequest> getDryRunRequest() {
        Request<ReportInstanceStatusRequest> request = new ReportInstanceStatusRequestMarshaller().marshall(this);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getInstances() != null)
            sb.append("Instances: ").append(getInstances()).append(",");
        if (getReasonCodes() != null)
            sb.append("ReasonCodes: ").append(getReasonCodes()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReportInstanceStatusRequest == false)
            return false;
        ReportInstanceStatusRequest other = (ReportInstanceStatusRequest) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getInstances() == null ^ this.getInstances() == null)
            return false;
        if (other.getInstances() != null && other.getInstances().equals(this.getInstances()) == false)
            return false;
        if (other.getReasonCodes() == null ^ this.getReasonCodes() == null)
            return false;
        if (other.getReasonCodes() != null && other.getReasonCodes().equals(this.getReasonCodes()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getInstances() == null) ? 0 : getInstances().hashCode());
        hashCode = prime * hashCode + ((getReasonCodes() == null) ? 0 : getReasonCodes().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public ReportInstanceStatusRequest clone() {
        return (ReportInstanceStatusRequest) super.clone();
    }
}
