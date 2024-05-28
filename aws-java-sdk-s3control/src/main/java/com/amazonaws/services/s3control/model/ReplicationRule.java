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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Specifies which S3 on Outposts objects to replicate and where to store the replicas.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/ReplicationRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplicationRule implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the rule. The maximum value is 255 characters.
     * </p>
     */
    private String iD;
    /**
     * <p>
     * The priority indicates which rule has precedence whenever two or more replication rules conflict. S3 on Outposts
     * attempts to replicate objects according to all replication rules. However, if there are two or more rules with
     * the same destination Outposts bucket, then objects will be replicated according to the rule with the highest
     * priority. The higher the number, the higher the priority.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/replication-between-outposts.html">Creating
     * replication rules on Outposts</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     */
    private Integer priority;
    /**
     * <p>
     * An object key name prefix that identifies the object or objects to which the rule applies. The maximum prefix
     * length is 1,024 characters. To include all objects in an Outposts bucket, specify an empty string.
     * </p>
     * <important>
     * <p>
     * When you're using XML requests, you must replace special characters (such as carriage returns) in object keys
     * with their equivalent XML entity codes. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-keys.html#object-key-xml-related-constraints">
     * XML-related object key constraints</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * </important>
     */
    @Deprecated
    private String prefix;
    /**
     * <p>
     * A filter that identifies the subset of objects to which the replication rule applies. A <code>Filter</code>
     * element must specify exactly one <code>Prefix</code>, <code>Tag</code>, or <code>And</code> child element.
     * </p>
     */
    private ReplicationRuleFilter filter;
    /**
     * <p>
     * Specifies whether the rule is enabled.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A container that describes additional filters for identifying the source Outposts objects that you want to
     * replicate. You can choose to enable or disable the replication of these objects.
     * </p>
     */
    private SourceSelectionCriteria sourceSelectionCriteria;
    /**
     * <p>
     * An optional configuration to replicate existing source bucket objects.
     * </p>
     * <note>
     * <p>
     * This is not supported by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     */
    private ExistingObjectReplication existingObjectReplication;
    /**
     * <p>
     * A container for information about the replication destination and its configurations.
     * </p>
     */
    private Destination destination;
    /**
     * <p>
     * Specifies whether S3 on Outposts replicates delete markers. If you specify a <code>Filter</code> element in your
     * replication configuration, you must also include a <code>DeleteMarkerReplication</code> element. If your
     * <code>Filter</code> includes a <code>Tag</code> element, the <code>DeleteMarkerReplication</code> element's
     * <code>Status</code> child element must be set to <code>Disabled</code>, because S3 on Outposts doesn't support
     * replicating delete markers for tag-based rules.
     * </p>
     * <p>
     * For more information about delete marker replication, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3OutpostsReplication.html#outposts-replication-what-is-replicated"
     * >How delete operations affect replication</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     */
    private DeleteMarkerReplication deleteMarkerReplication;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the access point for the source Outposts bucket that you want S3 on Outposts to
     * replicate the objects from.
     * </p>
     */
    private String bucket;

    /**
     * <p>
     * A unique identifier for the rule. The maximum value is 255 characters.
     * </p>
     * 
     * @param iD
     *        A unique identifier for the rule. The maximum value is 255 characters.
     */

    public void setID(String iD) {
        this.iD = iD;
    }

    /**
     * <p>
     * A unique identifier for the rule. The maximum value is 255 characters.
     * </p>
     * 
     * @return A unique identifier for the rule. The maximum value is 255 characters.
     */

    public String getID() {
        return this.iD;
    }

    /**
     * <p>
     * A unique identifier for the rule. The maximum value is 255 characters.
     * </p>
     * 
     * @param iD
     *        A unique identifier for the rule. The maximum value is 255 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationRule withID(String iD) {
        setID(iD);
        return this;
    }

    /**
     * <p>
     * The priority indicates which rule has precedence whenever two or more replication rules conflict. S3 on Outposts
     * attempts to replicate objects according to all replication rules. However, if there are two or more rules with
     * the same destination Outposts bucket, then objects will be replicated according to the rule with the highest
     * priority. The higher the number, the higher the priority.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/replication-between-outposts.html">Creating
     * replication rules on Outposts</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * 
     * @param priority
     *        The priority indicates which rule has precedence whenever two or more replication rules conflict. S3 on
     *        Outposts attempts to replicate objects according to all replication rules. However, if there are two or
     *        more rules with the same destination Outposts bucket, then objects will be replicated according to the
     *        rule with the highest priority. The higher the number, the higher the priority. </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/replication-between-outposts.html">Creating
     *        replication rules on Outposts</a> in the <i>Amazon S3 User Guide</i>.
     */

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * The priority indicates which rule has precedence whenever two or more replication rules conflict. S3 on Outposts
     * attempts to replicate objects according to all replication rules. However, if there are two or more rules with
     * the same destination Outposts bucket, then objects will be replicated according to the rule with the highest
     * priority. The higher the number, the higher the priority.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/replication-between-outposts.html">Creating
     * replication rules on Outposts</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * 
     * @return The priority indicates which rule has precedence whenever two or more replication rules conflict. S3 on
     *         Outposts attempts to replicate objects according to all replication rules. However, if there are two or
     *         more rules with the same destination Outposts bucket, then objects will be replicated according to the
     *         rule with the highest priority. The higher the number, the higher the priority. </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/replication-between-outposts.html">Creating
     *         replication rules on Outposts</a> in the <i>Amazon S3 User Guide</i>.
     */

    public Integer getPriority() {
        return this.priority;
    }

    /**
     * <p>
     * The priority indicates which rule has precedence whenever two or more replication rules conflict. S3 on Outposts
     * attempts to replicate objects according to all replication rules. However, if there are two or more rules with
     * the same destination Outposts bucket, then objects will be replicated according to the rule with the highest
     * priority. The higher the number, the higher the priority.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/replication-between-outposts.html">Creating
     * replication rules on Outposts</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * 
     * @param priority
     *        The priority indicates which rule has precedence whenever two or more replication rules conflict. S3 on
     *        Outposts attempts to replicate objects according to all replication rules. However, if there are two or
     *        more rules with the same destination Outposts bucket, then objects will be replicated according to the
     *        rule with the highest priority. The higher the number, the higher the priority. </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/replication-between-outposts.html">Creating
     *        replication rules on Outposts</a> in the <i>Amazon S3 User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationRule withPriority(Integer priority) {
        setPriority(priority);
        return this;
    }

    /**
     * <p>
     * An object key name prefix that identifies the object or objects to which the rule applies. The maximum prefix
     * length is 1,024 characters. To include all objects in an Outposts bucket, specify an empty string.
     * </p>
     * <important>
     * <p>
     * When you're using XML requests, you must replace special characters (such as carriage returns) in object keys
     * with their equivalent XML entity codes. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-keys.html#object-key-xml-related-constraints">
     * XML-related object key constraints</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * </important>
     * 
     * @param prefix
     *        An object key name prefix that identifies the object or objects to which the rule applies. The maximum
     *        prefix length is 1,024 characters. To include all objects in an Outposts bucket, specify an empty
     *        string.</p> <important>
     *        <p>
     *        When you're using XML requests, you must replace special characters (such as carriage returns) in object
     *        keys with their equivalent XML entity codes. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-keys.html#object-key-xml-related-constraints"
     *        > XML-related object key constraints</a> in the <i>Amazon S3 User Guide</i>.
     *        </p>
     */
    @Deprecated
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * <p>
     * An object key name prefix that identifies the object or objects to which the rule applies. The maximum prefix
     * length is 1,024 characters. To include all objects in an Outposts bucket, specify an empty string.
     * </p>
     * <important>
     * <p>
     * When you're using XML requests, you must replace special characters (such as carriage returns) in object keys
     * with their equivalent XML entity codes. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-keys.html#object-key-xml-related-constraints">
     * XML-related object key constraints</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * </important>
     * 
     * @return An object key name prefix that identifies the object or objects to which the rule applies. The maximum
     *         prefix length is 1,024 characters. To include all objects in an Outposts bucket, specify an empty
     *         string.</p> <important>
     *         <p>
     *         When you're using XML requests, you must replace special characters (such as carriage returns) in object
     *         keys with their equivalent XML entity codes. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-keys.html#object-key-xml-related-constraints"
     *         > XML-related object key constraints</a> in the <i>Amazon S3 User Guide</i>.
     *         </p>
     */
    @Deprecated
    public String getPrefix() {
        return this.prefix;
    }

    /**
     * <p>
     * An object key name prefix that identifies the object or objects to which the rule applies. The maximum prefix
     * length is 1,024 characters. To include all objects in an Outposts bucket, specify an empty string.
     * </p>
     * <important>
     * <p>
     * When you're using XML requests, you must replace special characters (such as carriage returns) in object keys
     * with their equivalent XML entity codes. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-keys.html#object-key-xml-related-constraints">
     * XML-related object key constraints</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * </important>
     * 
     * @param prefix
     *        An object key name prefix that identifies the object or objects to which the rule applies. The maximum
     *        prefix length is 1,024 characters. To include all objects in an Outposts bucket, specify an empty
     *        string.</p> <important>
     *        <p>
     *        When you're using XML requests, you must replace special characters (such as carriage returns) in object
     *        keys with their equivalent XML entity codes. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-keys.html#object-key-xml-related-constraints"
     *        > XML-related object key constraints</a> in the <i>Amazon S3 User Guide</i>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public ReplicationRule withPrefix(String prefix) {
        setPrefix(prefix);
        return this;
    }

    /**
     * <p>
     * A filter that identifies the subset of objects to which the replication rule applies. A <code>Filter</code>
     * element must specify exactly one <code>Prefix</code>, <code>Tag</code>, or <code>And</code> child element.
     * </p>
     * 
     * @param filter
     *        A filter that identifies the subset of objects to which the replication rule applies. A
     *        <code>Filter</code> element must specify exactly one <code>Prefix</code>, <code>Tag</code>, or
     *        <code>And</code> child element.
     */

    public void setFilter(ReplicationRuleFilter filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * A filter that identifies the subset of objects to which the replication rule applies. A <code>Filter</code>
     * element must specify exactly one <code>Prefix</code>, <code>Tag</code>, or <code>And</code> child element.
     * </p>
     * 
     * @return A filter that identifies the subset of objects to which the replication rule applies. A
     *         <code>Filter</code> element must specify exactly one <code>Prefix</code>, <code>Tag</code>, or
     *         <code>And</code> child element.
     */

    public ReplicationRuleFilter getFilter() {
        return this.filter;
    }

    /**
     * <p>
     * A filter that identifies the subset of objects to which the replication rule applies. A <code>Filter</code>
     * element must specify exactly one <code>Prefix</code>, <code>Tag</code>, or <code>And</code> child element.
     * </p>
     * 
     * @param filter
     *        A filter that identifies the subset of objects to which the replication rule applies. A
     *        <code>Filter</code> element must specify exactly one <code>Prefix</code>, <code>Tag</code>, or
     *        <code>And</code> child element.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationRule withFilter(ReplicationRuleFilter filter) {
        setFilter(filter);
        return this;
    }

    /**
     * <p>
     * Specifies whether the rule is enabled.
     * </p>
     * 
     * @param status
     *        Specifies whether the rule is enabled.
     * @see ReplicationRuleStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Specifies whether the rule is enabled.
     * </p>
     * 
     * @return Specifies whether the rule is enabled.
     * @see ReplicationRuleStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Specifies whether the rule is enabled.
     * </p>
     * 
     * @param status
     *        Specifies whether the rule is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationRuleStatus
     */

    public ReplicationRule withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Specifies whether the rule is enabled.
     * </p>
     * 
     * @param status
     *        Specifies whether the rule is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationRuleStatus
     */

    public ReplicationRule withStatus(ReplicationRuleStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A container that describes additional filters for identifying the source Outposts objects that you want to
     * replicate. You can choose to enable or disable the replication of these objects.
     * </p>
     * 
     * @param sourceSelectionCriteria
     *        A container that describes additional filters for identifying the source Outposts objects that you want to
     *        replicate. You can choose to enable or disable the replication of these objects.
     */

    public void setSourceSelectionCriteria(SourceSelectionCriteria sourceSelectionCriteria) {
        this.sourceSelectionCriteria = sourceSelectionCriteria;
    }

    /**
     * <p>
     * A container that describes additional filters for identifying the source Outposts objects that you want to
     * replicate. You can choose to enable or disable the replication of these objects.
     * </p>
     * 
     * @return A container that describes additional filters for identifying the source Outposts objects that you want
     *         to replicate. You can choose to enable or disable the replication of these objects.
     */

    public SourceSelectionCriteria getSourceSelectionCriteria() {
        return this.sourceSelectionCriteria;
    }

    /**
     * <p>
     * A container that describes additional filters for identifying the source Outposts objects that you want to
     * replicate. You can choose to enable or disable the replication of these objects.
     * </p>
     * 
     * @param sourceSelectionCriteria
     *        A container that describes additional filters for identifying the source Outposts objects that you want to
     *        replicate. You can choose to enable or disable the replication of these objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationRule withSourceSelectionCriteria(SourceSelectionCriteria sourceSelectionCriteria) {
        setSourceSelectionCriteria(sourceSelectionCriteria);
        return this;
    }

    /**
     * <p>
     * An optional configuration to replicate existing source bucket objects.
     * </p>
     * <note>
     * <p>
     * This is not supported by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     * 
     * @param existingObjectReplication
     *        An optional configuration to replicate existing source bucket objects. </p> <note>
     *        <p>
     *        This is not supported by Amazon S3 on Outposts buckets.
     *        </p>
     */

    public void setExistingObjectReplication(ExistingObjectReplication existingObjectReplication) {
        this.existingObjectReplication = existingObjectReplication;
    }

    /**
     * <p>
     * An optional configuration to replicate existing source bucket objects.
     * </p>
     * <note>
     * <p>
     * This is not supported by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     * 
     * @return An optional configuration to replicate existing source bucket objects. </p> <note>
     *         <p>
     *         This is not supported by Amazon S3 on Outposts buckets.
     *         </p>
     */

    public ExistingObjectReplication getExistingObjectReplication() {
        return this.existingObjectReplication;
    }

    /**
     * <p>
     * An optional configuration to replicate existing source bucket objects.
     * </p>
     * <note>
     * <p>
     * This is not supported by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     * 
     * @param existingObjectReplication
     *        An optional configuration to replicate existing source bucket objects. </p> <note>
     *        <p>
     *        This is not supported by Amazon S3 on Outposts buckets.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationRule withExistingObjectReplication(ExistingObjectReplication existingObjectReplication) {
        setExistingObjectReplication(existingObjectReplication);
        return this;
    }

    /**
     * <p>
     * A container for information about the replication destination and its configurations.
     * </p>
     * 
     * @param destination
     *        A container for information about the replication destination and its configurations.
     */

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    /**
     * <p>
     * A container for information about the replication destination and its configurations.
     * </p>
     * 
     * @return A container for information about the replication destination and its configurations.
     */

    public Destination getDestination() {
        return this.destination;
    }

    /**
     * <p>
     * A container for information about the replication destination and its configurations.
     * </p>
     * 
     * @param destination
     *        A container for information about the replication destination and its configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationRule withDestination(Destination destination) {
        setDestination(destination);
        return this;
    }

    /**
     * <p>
     * Specifies whether S3 on Outposts replicates delete markers. If you specify a <code>Filter</code> element in your
     * replication configuration, you must also include a <code>DeleteMarkerReplication</code> element. If your
     * <code>Filter</code> includes a <code>Tag</code> element, the <code>DeleteMarkerReplication</code> element's
     * <code>Status</code> child element must be set to <code>Disabled</code>, because S3 on Outposts doesn't support
     * replicating delete markers for tag-based rules.
     * </p>
     * <p>
     * For more information about delete marker replication, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3OutpostsReplication.html#outposts-replication-what-is-replicated"
     * >How delete operations affect replication</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * 
     * @param deleteMarkerReplication
     *        Specifies whether S3 on Outposts replicates delete markers. If you specify a <code>Filter</code> element
     *        in your replication configuration, you must also include a <code>DeleteMarkerReplication</code> element.
     *        If your <code>Filter</code> includes a <code>Tag</code> element, the <code>DeleteMarkerReplication</code>
     *        element's <code>Status</code> child element must be set to <code>Disabled</code>, because S3 on Outposts
     *        doesn't support replicating delete markers for tag-based rules.</p>
     *        <p>
     *        For more information about delete marker replication, see <a href=
     *        "https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3OutpostsReplication.html#outposts-replication-what-is-replicated"
     *        >How delete operations affect replication</a> in the <i>Amazon S3 User Guide</i>.
     */

    public void setDeleteMarkerReplication(DeleteMarkerReplication deleteMarkerReplication) {
        this.deleteMarkerReplication = deleteMarkerReplication;
    }

    /**
     * <p>
     * Specifies whether S3 on Outposts replicates delete markers. If you specify a <code>Filter</code> element in your
     * replication configuration, you must also include a <code>DeleteMarkerReplication</code> element. If your
     * <code>Filter</code> includes a <code>Tag</code> element, the <code>DeleteMarkerReplication</code> element's
     * <code>Status</code> child element must be set to <code>Disabled</code>, because S3 on Outposts doesn't support
     * replicating delete markers for tag-based rules.
     * </p>
     * <p>
     * For more information about delete marker replication, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3OutpostsReplication.html#outposts-replication-what-is-replicated"
     * >How delete operations affect replication</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * 
     * @return Specifies whether S3 on Outposts replicates delete markers. If you specify a <code>Filter</code> element
     *         in your replication configuration, you must also include a <code>DeleteMarkerReplication</code> element.
     *         If your <code>Filter</code> includes a <code>Tag</code> element, the <code>DeleteMarkerReplication</code>
     *         element's <code>Status</code> child element must be set to <code>Disabled</code>, because S3 on Outposts
     *         doesn't support replicating delete markers for tag-based rules.</p>
     *         <p>
     *         For more information about delete marker replication, see <a href=
     *         "https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3OutpostsReplication.html#outposts-replication-what-is-replicated"
     *         >How delete operations affect replication</a> in the <i>Amazon S3 User Guide</i>.
     */

    public DeleteMarkerReplication getDeleteMarkerReplication() {
        return this.deleteMarkerReplication;
    }

    /**
     * <p>
     * Specifies whether S3 on Outposts replicates delete markers. If you specify a <code>Filter</code> element in your
     * replication configuration, you must also include a <code>DeleteMarkerReplication</code> element. If your
     * <code>Filter</code> includes a <code>Tag</code> element, the <code>DeleteMarkerReplication</code> element's
     * <code>Status</code> child element must be set to <code>Disabled</code>, because S3 on Outposts doesn't support
     * replicating delete markers for tag-based rules.
     * </p>
     * <p>
     * For more information about delete marker replication, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3OutpostsReplication.html#outposts-replication-what-is-replicated"
     * >How delete operations affect replication</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * 
     * @param deleteMarkerReplication
     *        Specifies whether S3 on Outposts replicates delete markers. If you specify a <code>Filter</code> element
     *        in your replication configuration, you must also include a <code>DeleteMarkerReplication</code> element.
     *        If your <code>Filter</code> includes a <code>Tag</code> element, the <code>DeleteMarkerReplication</code>
     *        element's <code>Status</code> child element must be set to <code>Disabled</code>, because S3 on Outposts
     *        doesn't support replicating delete markers for tag-based rules.</p>
     *        <p>
     *        For more information about delete marker replication, see <a href=
     *        "https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3OutpostsReplication.html#outposts-replication-what-is-replicated"
     *        >How delete operations affect replication</a> in the <i>Amazon S3 User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationRule withDeleteMarkerReplication(DeleteMarkerReplication deleteMarkerReplication) {
        setDeleteMarkerReplication(deleteMarkerReplication);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the access point for the source Outposts bucket that you want S3 on Outposts to
     * replicate the objects from.
     * </p>
     * 
     * @param bucket
     *        The Amazon Resource Name (ARN) of the access point for the source Outposts bucket that you want S3 on
     *        Outposts to replicate the objects from.
     */

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the access point for the source Outposts bucket that you want S3 on Outposts to
     * replicate the objects from.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the access point for the source Outposts bucket that you want S3 on
     *         Outposts to replicate the objects from.
     */

    public String getBucket() {
        return this.bucket;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the access point for the source Outposts bucket that you want S3 on Outposts to
     * replicate the objects from.
     * </p>
     * 
     * @param bucket
     *        The Amazon Resource Name (ARN) of the access point for the source Outposts bucket that you want S3 on
     *        Outposts to replicate the objects from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationRule withBucket(String bucket) {
        setBucket(bucket);
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
        if (getID() != null)
            sb.append("ID: ").append(getID()).append(",");
        if (getPriority() != null)
            sb.append("Priority: ").append(getPriority()).append(",");
        if (getPrefix() != null)
            sb.append("Prefix: ").append(getPrefix()).append(",");
        if (getFilter() != null)
            sb.append("Filter: ").append(getFilter()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getSourceSelectionCriteria() != null)
            sb.append("SourceSelectionCriteria: ").append(getSourceSelectionCriteria()).append(",");
        if (getExistingObjectReplication() != null)
            sb.append("ExistingObjectReplication: ").append(getExistingObjectReplication()).append(",");
        if (getDestination() != null)
            sb.append("Destination: ").append(getDestination()).append(",");
        if (getDeleteMarkerReplication() != null)
            sb.append("DeleteMarkerReplication: ").append(getDeleteMarkerReplication()).append(",");
        if (getBucket() != null)
            sb.append("Bucket: ").append(getBucket());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplicationRule == false)
            return false;
        ReplicationRule other = (ReplicationRule) obj;
        if (other.getID() == null ^ this.getID() == null)
            return false;
        if (other.getID() != null && other.getID().equals(this.getID()) == false)
            return false;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
            return false;
        if (other.getPrefix() == null ^ this.getPrefix() == null)
            return false;
        if (other.getPrefix() != null && other.getPrefix().equals(this.getPrefix()) == false)
            return false;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getSourceSelectionCriteria() == null ^ this.getSourceSelectionCriteria() == null)
            return false;
        if (other.getSourceSelectionCriteria() != null && other.getSourceSelectionCriteria().equals(this.getSourceSelectionCriteria()) == false)
            return false;
        if (other.getExistingObjectReplication() == null ^ this.getExistingObjectReplication() == null)
            return false;
        if (other.getExistingObjectReplication() != null && other.getExistingObjectReplication().equals(this.getExistingObjectReplication()) == false)
            return false;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null && other.getDestination().equals(this.getDestination()) == false)
            return false;
        if (other.getDeleteMarkerReplication() == null ^ this.getDeleteMarkerReplication() == null)
            return false;
        if (other.getDeleteMarkerReplication() != null && other.getDeleteMarkerReplication().equals(this.getDeleteMarkerReplication()) == false)
            return false;
        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getID() == null) ? 0 : getID().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getPrefix() == null) ? 0 : getPrefix().hashCode());
        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getSourceSelectionCriteria() == null) ? 0 : getSourceSelectionCriteria().hashCode());
        hashCode = prime * hashCode + ((getExistingObjectReplication() == null) ? 0 : getExistingObjectReplication().hashCode());
        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode + ((getDeleteMarkerReplication() == null) ? 0 : getDeleteMarkerReplication().hashCode());
        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        return hashCode;
    }

    @Override
    public ReplicationRule clone() {
        try {
            return (ReplicationRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
