/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securitylake.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides details about the Amazon Security Lake account subscription. Subscribers are notified of new objects for a
 * source as the data is written to your Amazon S3 bucket for Security Lake.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/SubscriberResource" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SubscriberResource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * You can choose to notify subscribers of new objects with an Amazon Simple Queue Service (Amazon SQS) queue or
     * through messaging to an HTTPS endpoint provided by the subscriber.
     * </p>
     * <p>
     * Subscribers can consume data by directly querying Lake Formation tables in your Amazon S3 bucket through services
     * like Amazon Athena. This subscription type is defined as <code>LAKEFORMATION</code>.
     * </p>
     */
    private java.util.List<String> accessTypes;
    /**
     * <p>
     * The date and time when the subscriber was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The Amazon Resource Name (ARN) which uniquely defines the AWS RAM resource share. Before accepting the RAM
     * resource share invitation, you can view details related to the RAM resource share.
     * </p>
     * <p>
     * This field is available only for Lake Formation subscribers created after March 8, 2023.
     * </p>
     */
    private String resourceShareArn;
    /**
     * <p>
     * The name of the resource share.
     * </p>
     */
    private String resourceShareName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) specifying the role of the subscriber.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The ARN for the Amazon S3 bucket.
     * </p>
     */
    private String s3BucketArn;
    /**
     * <p>
     * Amazon Security Lake supports log and event collection for natively supported Amazon Web Services. For more
     * information, see the <a
     * href="https://docs.aws.amazon.com/security-lake/latest/userguide/source-management.html">Amazon Security Lake
     * User Guide</a>.
     * </p>
     */
    private java.util.List<LogSourceResource> sources;
    /**
     * <p>
     * The subscriber ARN of the Amazon Security Lake subscriber account.
     * </p>
     */
    private String subscriberArn;
    /**
     * <p>
     * The subscriber descriptions for a subscriber account. The description for a subscriber includes
     * <code>subscriberName</code>, <code>accountID</code>, <code>externalID</code>, and <code>subscriberId</code>.
     * </p>
     */
    private String subscriberDescription;
    /**
     * <p>
     * The subscriber endpoint to which exception messages are posted.
     * </p>
     */
    private String subscriberEndpoint;
    /**
     * <p>
     * The subscriber ID of the Amazon Security Lake subscriber account.
     * </p>
     */
    private String subscriberId;
    /**
     * <p>
     * The AWS identity used to access your data.
     * </p>
     */
    private AwsIdentity subscriberIdentity;
    /**
     * <p>
     * The name of your Amazon Security Lake subscriber account.
     * </p>
     */
    private String subscriberName;
    /**
     * <p>
     * The subscriber status of the Amazon Security Lake subscriber account.
     * </p>
     */
    private String subscriberStatus;
    /**
     * <p>
     * The date and time when the subscriber was last updated.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * You can choose to notify subscribers of new objects with an Amazon Simple Queue Service (Amazon SQS) queue or
     * through messaging to an HTTPS endpoint provided by the subscriber.
     * </p>
     * <p>
     * Subscribers can consume data by directly querying Lake Formation tables in your Amazon S3 bucket through services
     * like Amazon Athena. This subscription type is defined as <code>LAKEFORMATION</code>.
     * </p>
     * 
     * @return You can choose to notify subscribers of new objects with an Amazon Simple Queue Service (Amazon SQS)
     *         queue or through messaging to an HTTPS endpoint provided by the subscriber.</p>
     *         <p>
     *         Subscribers can consume data by directly querying Lake Formation tables in your Amazon S3 bucket through
     *         services like Amazon Athena. This subscription type is defined as <code>LAKEFORMATION</code>.
     * @see AccessType
     */

    public java.util.List<String> getAccessTypes() {
        return accessTypes;
    }

    /**
     * <p>
     * You can choose to notify subscribers of new objects with an Amazon Simple Queue Service (Amazon SQS) queue or
     * through messaging to an HTTPS endpoint provided by the subscriber.
     * </p>
     * <p>
     * Subscribers can consume data by directly querying Lake Formation tables in your Amazon S3 bucket through services
     * like Amazon Athena. This subscription type is defined as <code>LAKEFORMATION</code>.
     * </p>
     * 
     * @param accessTypes
     *        You can choose to notify subscribers of new objects with an Amazon Simple Queue Service (Amazon SQS) queue
     *        or through messaging to an HTTPS endpoint provided by the subscriber.</p>
     *        <p>
     *        Subscribers can consume data by directly querying Lake Formation tables in your Amazon S3 bucket through
     *        services like Amazon Athena. This subscription type is defined as <code>LAKEFORMATION</code>.
     * @see AccessType
     */

    public void setAccessTypes(java.util.Collection<String> accessTypes) {
        if (accessTypes == null) {
            this.accessTypes = null;
            return;
        }

        this.accessTypes = new java.util.ArrayList<String>(accessTypes);
    }

    /**
     * <p>
     * You can choose to notify subscribers of new objects with an Amazon Simple Queue Service (Amazon SQS) queue or
     * through messaging to an HTTPS endpoint provided by the subscriber.
     * </p>
     * <p>
     * Subscribers can consume data by directly querying Lake Formation tables in your Amazon S3 bucket through services
     * like Amazon Athena. This subscription type is defined as <code>LAKEFORMATION</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccessTypes(java.util.Collection)} or {@link #withAccessTypes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param accessTypes
     *        You can choose to notify subscribers of new objects with an Amazon Simple Queue Service (Amazon SQS) queue
     *        or through messaging to an HTTPS endpoint provided by the subscriber.</p>
     *        <p>
     *        Subscribers can consume data by directly querying Lake Formation tables in your Amazon S3 bucket through
     *        services like Amazon Athena. This subscription type is defined as <code>LAKEFORMATION</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessType
     */

    public SubscriberResource withAccessTypes(String... accessTypes) {
        if (this.accessTypes == null) {
            setAccessTypes(new java.util.ArrayList<String>(accessTypes.length));
        }
        for (String ele : accessTypes) {
            this.accessTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * You can choose to notify subscribers of new objects with an Amazon Simple Queue Service (Amazon SQS) queue or
     * through messaging to an HTTPS endpoint provided by the subscriber.
     * </p>
     * <p>
     * Subscribers can consume data by directly querying Lake Formation tables in your Amazon S3 bucket through services
     * like Amazon Athena. This subscription type is defined as <code>LAKEFORMATION</code>.
     * </p>
     * 
     * @param accessTypes
     *        You can choose to notify subscribers of new objects with an Amazon Simple Queue Service (Amazon SQS) queue
     *        or through messaging to an HTTPS endpoint provided by the subscriber.</p>
     *        <p>
     *        Subscribers can consume data by directly querying Lake Formation tables in your Amazon S3 bucket through
     *        services like Amazon Athena. This subscription type is defined as <code>LAKEFORMATION</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessType
     */

    public SubscriberResource withAccessTypes(java.util.Collection<String> accessTypes) {
        setAccessTypes(accessTypes);
        return this;
    }

    /**
     * <p>
     * You can choose to notify subscribers of new objects with an Amazon Simple Queue Service (Amazon SQS) queue or
     * through messaging to an HTTPS endpoint provided by the subscriber.
     * </p>
     * <p>
     * Subscribers can consume data by directly querying Lake Formation tables in your Amazon S3 bucket through services
     * like Amazon Athena. This subscription type is defined as <code>LAKEFORMATION</code>.
     * </p>
     * 
     * @param accessTypes
     *        You can choose to notify subscribers of new objects with an Amazon Simple Queue Service (Amazon SQS) queue
     *        or through messaging to an HTTPS endpoint provided by the subscriber.</p>
     *        <p>
     *        Subscribers can consume data by directly querying Lake Formation tables in your Amazon S3 bucket through
     *        services like Amazon Athena. This subscription type is defined as <code>LAKEFORMATION</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessType
     */

    public SubscriberResource withAccessTypes(AccessType... accessTypes) {
        java.util.ArrayList<String> accessTypesCopy = new java.util.ArrayList<String>(accessTypes.length);
        for (AccessType value : accessTypes) {
            accessTypesCopy.add(value.toString());
        }
        if (getAccessTypes() == null) {
            setAccessTypes(accessTypesCopy);
        } else {
            getAccessTypes().addAll(accessTypesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The date and time when the subscriber was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time when the subscriber was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time when the subscriber was created.
     * </p>
     * 
     * @return The date and time when the subscriber was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time when the subscriber was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time when the subscriber was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubscriberResource withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) which uniquely defines the AWS RAM resource share. Before accepting the RAM
     * resource share invitation, you can view details related to the RAM resource share.
     * </p>
     * <p>
     * This field is available only for Lake Formation subscribers created after March 8, 2023.
     * </p>
     * 
     * @param resourceShareArn
     *        The Amazon Resource Name (ARN) which uniquely defines the AWS RAM resource share. Before accepting the RAM
     *        resource share invitation, you can view details related to the RAM resource share.</p>
     *        <p>
     *        This field is available only for Lake Formation subscribers created after March 8, 2023.
     */

    public void setResourceShareArn(String resourceShareArn) {
        this.resourceShareArn = resourceShareArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) which uniquely defines the AWS RAM resource share. Before accepting the RAM
     * resource share invitation, you can view details related to the RAM resource share.
     * </p>
     * <p>
     * This field is available only for Lake Formation subscribers created after March 8, 2023.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) which uniquely defines the AWS RAM resource share. Before accepting the
     *         RAM resource share invitation, you can view details related to the RAM resource share.</p>
     *         <p>
     *         This field is available only for Lake Formation subscribers created after March 8, 2023.
     */

    public String getResourceShareArn() {
        return this.resourceShareArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) which uniquely defines the AWS RAM resource share. Before accepting the RAM
     * resource share invitation, you can view details related to the RAM resource share.
     * </p>
     * <p>
     * This field is available only for Lake Formation subscribers created after March 8, 2023.
     * </p>
     * 
     * @param resourceShareArn
     *        The Amazon Resource Name (ARN) which uniquely defines the AWS RAM resource share. Before accepting the RAM
     *        resource share invitation, you can view details related to the RAM resource share.</p>
     *        <p>
     *        This field is available only for Lake Formation subscribers created after March 8, 2023.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubscriberResource withResourceShareArn(String resourceShareArn) {
        setResourceShareArn(resourceShareArn);
        return this;
    }

    /**
     * <p>
     * The name of the resource share.
     * </p>
     * 
     * @param resourceShareName
     *        The name of the resource share.
     */

    public void setResourceShareName(String resourceShareName) {
        this.resourceShareName = resourceShareName;
    }

    /**
     * <p>
     * The name of the resource share.
     * </p>
     * 
     * @return The name of the resource share.
     */

    public String getResourceShareName() {
        return this.resourceShareName;
    }

    /**
     * <p>
     * The name of the resource share.
     * </p>
     * 
     * @param resourceShareName
     *        The name of the resource share.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubscriberResource withResourceShareName(String resourceShareName) {
        setResourceShareName(resourceShareName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) specifying the role of the subscriber.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) specifying the role of the subscriber.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) specifying the role of the subscriber.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) specifying the role of the subscriber.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) specifying the role of the subscriber.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) specifying the role of the subscriber.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubscriberResource withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The ARN for the Amazon S3 bucket.
     * </p>
     * 
     * @param s3BucketArn
     *        The ARN for the Amazon S3 bucket.
     */

    public void setS3BucketArn(String s3BucketArn) {
        this.s3BucketArn = s3BucketArn;
    }

    /**
     * <p>
     * The ARN for the Amazon S3 bucket.
     * </p>
     * 
     * @return The ARN for the Amazon S3 bucket.
     */

    public String getS3BucketArn() {
        return this.s3BucketArn;
    }

    /**
     * <p>
     * The ARN for the Amazon S3 bucket.
     * </p>
     * 
     * @param s3BucketArn
     *        The ARN for the Amazon S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubscriberResource withS3BucketArn(String s3BucketArn) {
        setS3BucketArn(s3BucketArn);
        return this;
    }

    /**
     * <p>
     * Amazon Security Lake supports log and event collection for natively supported Amazon Web Services. For more
     * information, see the <a
     * href="https://docs.aws.amazon.com/security-lake/latest/userguide/source-management.html">Amazon Security Lake
     * User Guide</a>.
     * </p>
     * 
     * @return Amazon Security Lake supports log and event collection for natively supported Amazon Web Services. For
     *         more information, see the <a
     *         href="https://docs.aws.amazon.com/security-lake/latest/userguide/source-management.html">Amazon Security
     *         Lake User Guide</a>.
     */

    public java.util.List<LogSourceResource> getSources() {
        return sources;
    }

    /**
     * <p>
     * Amazon Security Lake supports log and event collection for natively supported Amazon Web Services. For more
     * information, see the <a
     * href="https://docs.aws.amazon.com/security-lake/latest/userguide/source-management.html">Amazon Security Lake
     * User Guide</a>.
     * </p>
     * 
     * @param sources
     *        Amazon Security Lake supports log and event collection for natively supported Amazon Web Services. For
     *        more information, see the <a
     *        href="https://docs.aws.amazon.com/security-lake/latest/userguide/source-management.html">Amazon Security
     *        Lake User Guide</a>.
     */

    public void setSources(java.util.Collection<LogSourceResource> sources) {
        if (sources == null) {
            this.sources = null;
            return;
        }

        this.sources = new java.util.ArrayList<LogSourceResource>(sources);
    }

    /**
     * <p>
     * Amazon Security Lake supports log and event collection for natively supported Amazon Web Services. For more
     * information, see the <a
     * href="https://docs.aws.amazon.com/security-lake/latest/userguide/source-management.html">Amazon Security Lake
     * User Guide</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSources(java.util.Collection)} or {@link #withSources(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param sources
     *        Amazon Security Lake supports log and event collection for natively supported Amazon Web Services. For
     *        more information, see the <a
     *        href="https://docs.aws.amazon.com/security-lake/latest/userguide/source-management.html">Amazon Security
     *        Lake User Guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubscriberResource withSources(LogSourceResource... sources) {
        if (this.sources == null) {
            setSources(new java.util.ArrayList<LogSourceResource>(sources.length));
        }
        for (LogSourceResource ele : sources) {
            this.sources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Amazon Security Lake supports log and event collection for natively supported Amazon Web Services. For more
     * information, see the <a
     * href="https://docs.aws.amazon.com/security-lake/latest/userguide/source-management.html">Amazon Security Lake
     * User Guide</a>.
     * </p>
     * 
     * @param sources
     *        Amazon Security Lake supports log and event collection for natively supported Amazon Web Services. For
     *        more information, see the <a
     *        href="https://docs.aws.amazon.com/security-lake/latest/userguide/source-management.html">Amazon Security
     *        Lake User Guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubscriberResource withSources(java.util.Collection<LogSourceResource> sources) {
        setSources(sources);
        return this;
    }

    /**
     * <p>
     * The subscriber ARN of the Amazon Security Lake subscriber account.
     * </p>
     * 
     * @param subscriberArn
     *        The subscriber ARN of the Amazon Security Lake subscriber account.
     */

    public void setSubscriberArn(String subscriberArn) {
        this.subscriberArn = subscriberArn;
    }

    /**
     * <p>
     * The subscriber ARN of the Amazon Security Lake subscriber account.
     * </p>
     * 
     * @return The subscriber ARN of the Amazon Security Lake subscriber account.
     */

    public String getSubscriberArn() {
        return this.subscriberArn;
    }

    /**
     * <p>
     * The subscriber ARN of the Amazon Security Lake subscriber account.
     * </p>
     * 
     * @param subscriberArn
     *        The subscriber ARN of the Amazon Security Lake subscriber account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubscriberResource withSubscriberArn(String subscriberArn) {
        setSubscriberArn(subscriberArn);
        return this;
    }

    /**
     * <p>
     * The subscriber descriptions for a subscriber account. The description for a subscriber includes
     * <code>subscriberName</code>, <code>accountID</code>, <code>externalID</code>, and <code>subscriberId</code>.
     * </p>
     * 
     * @param subscriberDescription
     *        The subscriber descriptions for a subscriber account. The description for a subscriber includes
     *        <code>subscriberName</code>, <code>accountID</code>, <code>externalID</code>, and
     *        <code>subscriberId</code>.
     */

    public void setSubscriberDescription(String subscriberDescription) {
        this.subscriberDescription = subscriberDescription;
    }

    /**
     * <p>
     * The subscriber descriptions for a subscriber account. The description for a subscriber includes
     * <code>subscriberName</code>, <code>accountID</code>, <code>externalID</code>, and <code>subscriberId</code>.
     * </p>
     * 
     * @return The subscriber descriptions for a subscriber account. The description for a subscriber includes
     *         <code>subscriberName</code>, <code>accountID</code>, <code>externalID</code>, and
     *         <code>subscriberId</code>.
     */

    public String getSubscriberDescription() {
        return this.subscriberDescription;
    }

    /**
     * <p>
     * The subscriber descriptions for a subscriber account. The description for a subscriber includes
     * <code>subscriberName</code>, <code>accountID</code>, <code>externalID</code>, and <code>subscriberId</code>.
     * </p>
     * 
     * @param subscriberDescription
     *        The subscriber descriptions for a subscriber account. The description for a subscriber includes
     *        <code>subscriberName</code>, <code>accountID</code>, <code>externalID</code>, and
     *        <code>subscriberId</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubscriberResource withSubscriberDescription(String subscriberDescription) {
        setSubscriberDescription(subscriberDescription);
        return this;
    }

    /**
     * <p>
     * The subscriber endpoint to which exception messages are posted.
     * </p>
     * 
     * @param subscriberEndpoint
     *        The subscriber endpoint to which exception messages are posted.
     */

    public void setSubscriberEndpoint(String subscriberEndpoint) {
        this.subscriberEndpoint = subscriberEndpoint;
    }

    /**
     * <p>
     * The subscriber endpoint to which exception messages are posted.
     * </p>
     * 
     * @return The subscriber endpoint to which exception messages are posted.
     */

    public String getSubscriberEndpoint() {
        return this.subscriberEndpoint;
    }

    /**
     * <p>
     * The subscriber endpoint to which exception messages are posted.
     * </p>
     * 
     * @param subscriberEndpoint
     *        The subscriber endpoint to which exception messages are posted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubscriberResource withSubscriberEndpoint(String subscriberEndpoint) {
        setSubscriberEndpoint(subscriberEndpoint);
        return this;
    }

    /**
     * <p>
     * The subscriber ID of the Amazon Security Lake subscriber account.
     * </p>
     * 
     * @param subscriberId
     *        The subscriber ID of the Amazon Security Lake subscriber account.
     */

    public void setSubscriberId(String subscriberId) {
        this.subscriberId = subscriberId;
    }

    /**
     * <p>
     * The subscriber ID of the Amazon Security Lake subscriber account.
     * </p>
     * 
     * @return The subscriber ID of the Amazon Security Lake subscriber account.
     */

    public String getSubscriberId() {
        return this.subscriberId;
    }

    /**
     * <p>
     * The subscriber ID of the Amazon Security Lake subscriber account.
     * </p>
     * 
     * @param subscriberId
     *        The subscriber ID of the Amazon Security Lake subscriber account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubscriberResource withSubscriberId(String subscriberId) {
        setSubscriberId(subscriberId);
        return this;
    }

    /**
     * <p>
     * The AWS identity used to access your data.
     * </p>
     * 
     * @param subscriberIdentity
     *        The AWS identity used to access your data.
     */

    public void setSubscriberIdentity(AwsIdentity subscriberIdentity) {
        this.subscriberIdentity = subscriberIdentity;
    }

    /**
     * <p>
     * The AWS identity used to access your data.
     * </p>
     * 
     * @return The AWS identity used to access your data.
     */

    public AwsIdentity getSubscriberIdentity() {
        return this.subscriberIdentity;
    }

    /**
     * <p>
     * The AWS identity used to access your data.
     * </p>
     * 
     * @param subscriberIdentity
     *        The AWS identity used to access your data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubscriberResource withSubscriberIdentity(AwsIdentity subscriberIdentity) {
        setSubscriberIdentity(subscriberIdentity);
        return this;
    }

    /**
     * <p>
     * The name of your Amazon Security Lake subscriber account.
     * </p>
     * 
     * @param subscriberName
     *        The name of your Amazon Security Lake subscriber account.
     */

    public void setSubscriberName(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    /**
     * <p>
     * The name of your Amazon Security Lake subscriber account.
     * </p>
     * 
     * @return The name of your Amazon Security Lake subscriber account.
     */

    public String getSubscriberName() {
        return this.subscriberName;
    }

    /**
     * <p>
     * The name of your Amazon Security Lake subscriber account.
     * </p>
     * 
     * @param subscriberName
     *        The name of your Amazon Security Lake subscriber account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubscriberResource withSubscriberName(String subscriberName) {
        setSubscriberName(subscriberName);
        return this;
    }

    /**
     * <p>
     * The subscriber status of the Amazon Security Lake subscriber account.
     * </p>
     * 
     * @param subscriberStatus
     *        The subscriber status of the Amazon Security Lake subscriber account.
     * @see SubscriberStatus
     */

    public void setSubscriberStatus(String subscriberStatus) {
        this.subscriberStatus = subscriberStatus;
    }

    /**
     * <p>
     * The subscriber status of the Amazon Security Lake subscriber account.
     * </p>
     * 
     * @return The subscriber status of the Amazon Security Lake subscriber account.
     * @see SubscriberStatus
     */

    public String getSubscriberStatus() {
        return this.subscriberStatus;
    }

    /**
     * <p>
     * The subscriber status of the Amazon Security Lake subscriber account.
     * </p>
     * 
     * @param subscriberStatus
     *        The subscriber status of the Amazon Security Lake subscriber account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SubscriberStatus
     */

    public SubscriberResource withSubscriberStatus(String subscriberStatus) {
        setSubscriberStatus(subscriberStatus);
        return this;
    }

    /**
     * <p>
     * The subscriber status of the Amazon Security Lake subscriber account.
     * </p>
     * 
     * @param subscriberStatus
     *        The subscriber status of the Amazon Security Lake subscriber account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SubscriberStatus
     */

    public SubscriberResource withSubscriberStatus(SubscriberStatus subscriberStatus) {
        this.subscriberStatus = subscriberStatus.toString();
        return this;
    }

    /**
     * <p>
     * The date and time when the subscriber was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The date and time when the subscriber was last updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The date and time when the subscriber was last updated.
     * </p>
     * 
     * @return The date and time when the subscriber was last updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The date and time when the subscriber was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The date and time when the subscriber was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubscriberResource withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
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
        if (getAccessTypes() != null)
            sb.append("AccessTypes: ").append(getAccessTypes()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getResourceShareArn() != null)
            sb.append("ResourceShareArn: ").append(getResourceShareArn()).append(",");
        if (getResourceShareName() != null)
            sb.append("ResourceShareName: ").append(getResourceShareName()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getS3BucketArn() != null)
            sb.append("S3BucketArn: ").append(getS3BucketArn()).append(",");
        if (getSources() != null)
            sb.append("Sources: ").append(getSources()).append(",");
        if (getSubscriberArn() != null)
            sb.append("SubscriberArn: ").append(getSubscriberArn()).append(",");
        if (getSubscriberDescription() != null)
            sb.append("SubscriberDescription: ").append(getSubscriberDescription()).append(",");
        if (getSubscriberEndpoint() != null)
            sb.append("SubscriberEndpoint: ").append(getSubscriberEndpoint()).append(",");
        if (getSubscriberId() != null)
            sb.append("SubscriberId: ").append(getSubscriberId()).append(",");
        if (getSubscriberIdentity() != null)
            sb.append("SubscriberIdentity: ").append(getSubscriberIdentity()).append(",");
        if (getSubscriberName() != null)
            sb.append("SubscriberName: ").append(getSubscriberName()).append(",");
        if (getSubscriberStatus() != null)
            sb.append("SubscriberStatus: ").append(getSubscriberStatus()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SubscriberResource == false)
            return false;
        SubscriberResource other = (SubscriberResource) obj;
        if (other.getAccessTypes() == null ^ this.getAccessTypes() == null)
            return false;
        if (other.getAccessTypes() != null && other.getAccessTypes().equals(this.getAccessTypes()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getResourceShareArn() == null ^ this.getResourceShareArn() == null)
            return false;
        if (other.getResourceShareArn() != null && other.getResourceShareArn().equals(this.getResourceShareArn()) == false)
            return false;
        if (other.getResourceShareName() == null ^ this.getResourceShareName() == null)
            return false;
        if (other.getResourceShareName() != null && other.getResourceShareName().equals(this.getResourceShareName()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getS3BucketArn() == null ^ this.getS3BucketArn() == null)
            return false;
        if (other.getS3BucketArn() != null && other.getS3BucketArn().equals(this.getS3BucketArn()) == false)
            return false;
        if (other.getSources() == null ^ this.getSources() == null)
            return false;
        if (other.getSources() != null && other.getSources().equals(this.getSources()) == false)
            return false;
        if (other.getSubscriberArn() == null ^ this.getSubscriberArn() == null)
            return false;
        if (other.getSubscriberArn() != null && other.getSubscriberArn().equals(this.getSubscriberArn()) == false)
            return false;
        if (other.getSubscriberDescription() == null ^ this.getSubscriberDescription() == null)
            return false;
        if (other.getSubscriberDescription() != null && other.getSubscriberDescription().equals(this.getSubscriberDescription()) == false)
            return false;
        if (other.getSubscriberEndpoint() == null ^ this.getSubscriberEndpoint() == null)
            return false;
        if (other.getSubscriberEndpoint() != null && other.getSubscriberEndpoint().equals(this.getSubscriberEndpoint()) == false)
            return false;
        if (other.getSubscriberId() == null ^ this.getSubscriberId() == null)
            return false;
        if (other.getSubscriberId() != null && other.getSubscriberId().equals(this.getSubscriberId()) == false)
            return false;
        if (other.getSubscriberIdentity() == null ^ this.getSubscriberIdentity() == null)
            return false;
        if (other.getSubscriberIdentity() != null && other.getSubscriberIdentity().equals(this.getSubscriberIdentity()) == false)
            return false;
        if (other.getSubscriberName() == null ^ this.getSubscriberName() == null)
            return false;
        if (other.getSubscriberName() != null && other.getSubscriberName().equals(this.getSubscriberName()) == false)
            return false;
        if (other.getSubscriberStatus() == null ^ this.getSubscriberStatus() == null)
            return false;
        if (other.getSubscriberStatus() != null && other.getSubscriberStatus().equals(this.getSubscriberStatus()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessTypes() == null) ? 0 : getAccessTypes().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getResourceShareArn() == null) ? 0 : getResourceShareArn().hashCode());
        hashCode = prime * hashCode + ((getResourceShareName() == null) ? 0 : getResourceShareName().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getS3BucketArn() == null) ? 0 : getS3BucketArn().hashCode());
        hashCode = prime * hashCode + ((getSources() == null) ? 0 : getSources().hashCode());
        hashCode = prime * hashCode + ((getSubscriberArn() == null) ? 0 : getSubscriberArn().hashCode());
        hashCode = prime * hashCode + ((getSubscriberDescription() == null) ? 0 : getSubscriberDescription().hashCode());
        hashCode = prime * hashCode + ((getSubscriberEndpoint() == null) ? 0 : getSubscriberEndpoint().hashCode());
        hashCode = prime * hashCode + ((getSubscriberId() == null) ? 0 : getSubscriberId().hashCode());
        hashCode = prime * hashCode + ((getSubscriberIdentity() == null) ? 0 : getSubscriberIdentity().hashCode());
        hashCode = prime * hashCode + ((getSubscriberName() == null) ? 0 : getSubscriberName().hashCode());
        hashCode = prime * hashCode + ((getSubscriberStatus() == null) ? 0 : getSubscriberStatus().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public SubscriberResource clone() {
        try {
            return (SubscriberResource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securitylake.model.transform.SubscriberResourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
