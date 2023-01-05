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
package com.amazonaws.services.arczonalshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/arc-zonal-shift-2022-10-30/StartZonalShift" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartZonalShiftRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Availability Zone that traffic is moved away from for a resource when you start a zonal shift. Until the
     * zonal shift expires or you cancel it, traffic for the resource is instead moved to other Availability Zones in
     * the AWS Region.
     * </p>
     */
    private String awayFrom;
    /**
     * <p>
     * A comment that you enter about the zonal shift. Only the latest comment is retained; no comment history is
     * maintained. A new comment overwrites any existing comment string.
     * </p>
     */
    private String comment;
    /**
     * <p>
     * The length of time that you want a zonal shift to be active, which Route 53 ARC converts to an expiry time
     * (expiration time). Zonal shifts are temporary. You can set a zonal shift to be active initially for up to three
     * days (72 hours).
     * </p>
     * <p>
     * If you want to still keep traffic away from an Availability Zone, you can update the zonal shift and set a new
     * expiration. You can also cancel a zonal shift, before it expires, for example, if you're ready to restore traffic
     * to the Availability Zone.
     * </p>
     * <p>
     * To set a length of time for a zonal shift to be active, specify a whole number, and then one of the following,
     * with no space:
     * </p>
     * 
     * <pre>
     * <code> &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;A lowercase letter m:&lt;/b&gt; To specify that the value is in minutes.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;A lowercase letter h:&lt;/b&gt; To specify that the value is in hours.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;p&gt;For example: &lt;code&gt;20h&lt;/code&gt; means the zonal shift expires in 20 hours. &lt;code&gt;120m&lt;/code&gt; means the zonal shift expires in 120 minutes (2 hours).&lt;/p&gt; </code>
     * </pre>
     */
    private String expiresIn;
    /**
     * <p>
     * The identifier for the resource to include in a zonal shift. The identifier is the Amazon Resource Name (ARN) for
     * the resource.
     * </p>
     * <p>
     * At this time, you can only start a zonal shift for Network Load Balancers and Application Load Balancers with
     * cross-zone load balancing turned off.
     * </p>
     */
    private String resourceIdentifier;

    /**
     * <p>
     * The Availability Zone that traffic is moved away from for a resource when you start a zonal shift. Until the
     * zonal shift expires or you cancel it, traffic for the resource is instead moved to other Availability Zones in
     * the AWS Region.
     * </p>
     * 
     * @param awayFrom
     *        The Availability Zone that traffic is moved away from for a resource when you start a zonal shift. Until
     *        the zonal shift expires or you cancel it, traffic for the resource is instead moved to other Availability
     *        Zones in the AWS Region.
     */

    public void setAwayFrom(String awayFrom) {
        this.awayFrom = awayFrom;
    }

    /**
     * <p>
     * The Availability Zone that traffic is moved away from for a resource when you start a zonal shift. Until the
     * zonal shift expires or you cancel it, traffic for the resource is instead moved to other Availability Zones in
     * the AWS Region.
     * </p>
     * 
     * @return The Availability Zone that traffic is moved away from for a resource when you start a zonal shift. Until
     *         the zonal shift expires or you cancel it, traffic for the resource is instead moved to other Availability
     *         Zones in the AWS Region.
     */

    public String getAwayFrom() {
        return this.awayFrom;
    }

    /**
     * <p>
     * The Availability Zone that traffic is moved away from for a resource when you start a zonal shift. Until the
     * zonal shift expires or you cancel it, traffic for the resource is instead moved to other Availability Zones in
     * the AWS Region.
     * </p>
     * 
     * @param awayFrom
     *        The Availability Zone that traffic is moved away from for a resource when you start a zonal shift. Until
     *        the zonal shift expires or you cancel it, traffic for the resource is instead moved to other Availability
     *        Zones in the AWS Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartZonalShiftRequest withAwayFrom(String awayFrom) {
        setAwayFrom(awayFrom);
        return this;
    }

    /**
     * <p>
     * A comment that you enter about the zonal shift. Only the latest comment is retained; no comment history is
     * maintained. A new comment overwrites any existing comment string.
     * </p>
     * 
     * @param comment
     *        A comment that you enter about the zonal shift. Only the latest comment is retained; no comment history is
     *        maintained. A new comment overwrites any existing comment string.
     */

    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * A comment that you enter about the zonal shift. Only the latest comment is retained; no comment history is
     * maintained. A new comment overwrites any existing comment string.
     * </p>
     * 
     * @return A comment that you enter about the zonal shift. Only the latest comment is retained; no comment history
     *         is maintained. A new comment overwrites any existing comment string.
     */

    public String getComment() {
        return this.comment;
    }

    /**
     * <p>
     * A comment that you enter about the zonal shift. Only the latest comment is retained; no comment history is
     * maintained. A new comment overwrites any existing comment string.
     * </p>
     * 
     * @param comment
     *        A comment that you enter about the zonal shift. Only the latest comment is retained; no comment history is
     *        maintained. A new comment overwrites any existing comment string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartZonalShiftRequest withComment(String comment) {
        setComment(comment);
        return this;
    }

    /**
     * <p>
     * The length of time that you want a zonal shift to be active, which Route 53 ARC converts to an expiry time
     * (expiration time). Zonal shifts are temporary. You can set a zonal shift to be active initially for up to three
     * days (72 hours).
     * </p>
     * <p>
     * If you want to still keep traffic away from an Availability Zone, you can update the zonal shift and set a new
     * expiration. You can also cancel a zonal shift, before it expires, for example, if you're ready to restore traffic
     * to the Availability Zone.
     * </p>
     * <p>
     * To set a length of time for a zonal shift to be active, specify a whole number, and then one of the following,
     * with no space:
     * </p>
     * 
     * <pre>
     * <code> &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;A lowercase letter m:&lt;/b&gt; To specify that the value is in minutes.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;A lowercase letter h:&lt;/b&gt; To specify that the value is in hours.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;p&gt;For example: &lt;code&gt;20h&lt;/code&gt; means the zonal shift expires in 20 hours. &lt;code&gt;120m&lt;/code&gt; means the zonal shift expires in 120 minutes (2 hours).&lt;/p&gt; </code>
     * </pre>
     * 
     * @param expiresIn
     *        The length of time that you want a zonal shift to be active, which Route 53 ARC converts to an expiry time
     *        (expiration time). Zonal shifts are temporary. You can set a zonal shift to be active initially for up to
     *        three days (72 hours).</p>
     *        <p>
     *        If you want to still keep traffic away from an Availability Zone, you can update the zonal shift and set a
     *        new expiration. You can also cancel a zonal shift, before it expires, for example, if you're ready to
     *        restore traffic to the Availability Zone.
     *        </p>
     *        <p>
     *        To set a length of time for a zonal shift to be active, specify a whole number, and then one of the
     *        following, with no space:
     *        </p>
     * 
     * <pre><code> &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;A lowercase letter m:&lt;/b&gt; To specify that the value is in minutes.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;A lowercase letter h:&lt;/b&gt; To specify that the value is in hours.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;p&gt;For example: &lt;code&gt;20h&lt;/code&gt; means the zonal shift expires in 20 hours. &lt;code&gt;120m&lt;/code&gt; means the zonal shift expires in 120 minutes (2 hours).&lt;/p&gt; </code>
     */

    public void setExpiresIn(String expiresIn) {
        this.expiresIn = expiresIn;
    }

    /**
     * <p>
     * The length of time that you want a zonal shift to be active, which Route 53 ARC converts to an expiry time
     * (expiration time). Zonal shifts are temporary. You can set a zonal shift to be active initially for up to three
     * days (72 hours).
     * </p>
     * <p>
     * If you want to still keep traffic away from an Availability Zone, you can update the zonal shift and set a new
     * expiration. You can also cancel a zonal shift, before it expires, for example, if you're ready to restore traffic
     * to the Availability Zone.
     * </p>
     * <p>
     * To set a length of time for a zonal shift to be active, specify a whole number, and then one of the following,
     * with no space:
     * </p>
     * 
     * <pre>
     * <code> &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;A lowercase letter m:&lt;/b&gt; To specify that the value is in minutes.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;A lowercase letter h:&lt;/b&gt; To specify that the value is in hours.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;p&gt;For example: &lt;code&gt;20h&lt;/code&gt; means the zonal shift expires in 20 hours. &lt;code&gt;120m&lt;/code&gt; means the zonal shift expires in 120 minutes (2 hours).&lt;/p&gt; </code>
     * </pre>
     * 
     * @return The length of time that you want a zonal shift to be active, which Route 53 ARC converts to an expiry
     *         time (expiration time). Zonal shifts are temporary. You can set a zonal shift to be active initially for
     *         up to three days (72 hours).</p>
     *         <p>
     *         If you want to still keep traffic away from an Availability Zone, you can update the zonal shift and set
     *         a new expiration. You can also cancel a zonal shift, before it expires, for example, if you're ready to
     *         restore traffic to the Availability Zone.
     *         </p>
     *         <p>
     *         To set a length of time for a zonal shift to be active, specify a whole number, and then one of the
     *         following, with no space:
     *         </p>
     * 
     * <pre><code> &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;A lowercase letter m:&lt;/b&gt; To specify that the value is in minutes.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;A lowercase letter h:&lt;/b&gt; To specify that the value is in hours.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;p&gt;For example: &lt;code&gt;20h&lt;/code&gt; means the zonal shift expires in 20 hours. &lt;code&gt;120m&lt;/code&gt; means the zonal shift expires in 120 minutes (2 hours).&lt;/p&gt; </code>
     */

    public String getExpiresIn() {
        return this.expiresIn;
    }

    /**
     * <p>
     * The length of time that you want a zonal shift to be active, which Route 53 ARC converts to an expiry time
     * (expiration time). Zonal shifts are temporary. You can set a zonal shift to be active initially for up to three
     * days (72 hours).
     * </p>
     * <p>
     * If you want to still keep traffic away from an Availability Zone, you can update the zonal shift and set a new
     * expiration. You can also cancel a zonal shift, before it expires, for example, if you're ready to restore traffic
     * to the Availability Zone.
     * </p>
     * <p>
     * To set a length of time for a zonal shift to be active, specify a whole number, and then one of the following,
     * with no space:
     * </p>
     * 
     * <pre>
     * <code> &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;A lowercase letter m:&lt;/b&gt; To specify that the value is in minutes.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;A lowercase letter h:&lt;/b&gt; To specify that the value is in hours.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;p&gt;For example: &lt;code&gt;20h&lt;/code&gt; means the zonal shift expires in 20 hours. &lt;code&gt;120m&lt;/code&gt; means the zonal shift expires in 120 minutes (2 hours).&lt;/p&gt; </code>
     * </pre>
     * 
     * @param expiresIn
     *        The length of time that you want a zonal shift to be active, which Route 53 ARC converts to an expiry time
     *        (expiration time). Zonal shifts are temporary. You can set a zonal shift to be active initially for up to
     *        three days (72 hours).</p>
     *        <p>
     *        If you want to still keep traffic away from an Availability Zone, you can update the zonal shift and set a
     *        new expiration. You can also cancel a zonal shift, before it expires, for example, if you're ready to
     *        restore traffic to the Availability Zone.
     *        </p>
     *        <p>
     *        To set a length of time for a zonal shift to be active, specify a whole number, and then one of the
     *        following, with no space:
     *        </p>
     * 
     *        <pre>
     * <code> &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;A lowercase letter m:&lt;/b&gt; To specify that the value is in minutes.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;A lowercase letter h:&lt;/b&gt; To specify that the value is in hours.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;p&gt;For example: &lt;code&gt;20h&lt;/code&gt; means the zonal shift expires in 20 hours. &lt;code&gt;120m&lt;/code&gt; means the zonal shift expires in 120 minutes (2 hours).&lt;/p&gt; </code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartZonalShiftRequest withExpiresIn(String expiresIn) {
        setExpiresIn(expiresIn);
        return this;
    }

    /**
     * <p>
     * The identifier for the resource to include in a zonal shift. The identifier is the Amazon Resource Name (ARN) for
     * the resource.
     * </p>
     * <p>
     * At this time, you can only start a zonal shift for Network Load Balancers and Application Load Balancers with
     * cross-zone load balancing turned off.
     * </p>
     * 
     * @param resourceIdentifier
     *        The identifier for the resource to include in a zonal shift. The identifier is the Amazon Resource Name
     *        (ARN) for the resource.</p>
     *        <p>
     *        At this time, you can only start a zonal shift for Network Load Balancers and Application Load Balancers
     *        with cross-zone load balancing turned off.
     */

    public void setResourceIdentifier(String resourceIdentifier) {
        this.resourceIdentifier = resourceIdentifier;
    }

    /**
     * <p>
     * The identifier for the resource to include in a zonal shift. The identifier is the Amazon Resource Name (ARN) for
     * the resource.
     * </p>
     * <p>
     * At this time, you can only start a zonal shift for Network Load Balancers and Application Load Balancers with
     * cross-zone load balancing turned off.
     * </p>
     * 
     * @return The identifier for the resource to include in a zonal shift. The identifier is the Amazon Resource Name
     *         (ARN) for the resource.</p>
     *         <p>
     *         At this time, you can only start a zonal shift for Network Load Balancers and Application Load Balancers
     *         with cross-zone load balancing turned off.
     */

    public String getResourceIdentifier() {
        return this.resourceIdentifier;
    }

    /**
     * <p>
     * The identifier for the resource to include in a zonal shift. The identifier is the Amazon Resource Name (ARN) for
     * the resource.
     * </p>
     * <p>
     * At this time, you can only start a zonal shift for Network Load Balancers and Application Load Balancers with
     * cross-zone load balancing turned off.
     * </p>
     * 
     * @param resourceIdentifier
     *        The identifier for the resource to include in a zonal shift. The identifier is the Amazon Resource Name
     *        (ARN) for the resource.</p>
     *        <p>
     *        At this time, you can only start a zonal shift for Network Load Balancers and Application Load Balancers
     *        with cross-zone load balancing turned off.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartZonalShiftRequest withResourceIdentifier(String resourceIdentifier) {
        setResourceIdentifier(resourceIdentifier);
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
        if (getAwayFrom() != null)
            sb.append("AwayFrom: ").append(getAwayFrom()).append(",");
        if (getComment() != null)
            sb.append("Comment: ").append(getComment()).append(",");
        if (getExpiresIn() != null)
            sb.append("ExpiresIn: ").append(getExpiresIn()).append(",");
        if (getResourceIdentifier() != null)
            sb.append("ResourceIdentifier: ").append(getResourceIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartZonalShiftRequest == false)
            return false;
        StartZonalShiftRequest other = (StartZonalShiftRequest) obj;
        if (other.getAwayFrom() == null ^ this.getAwayFrom() == null)
            return false;
        if (other.getAwayFrom() != null && other.getAwayFrom().equals(this.getAwayFrom()) == false)
            return false;
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false)
            return false;
        if (other.getExpiresIn() == null ^ this.getExpiresIn() == null)
            return false;
        if (other.getExpiresIn() != null && other.getExpiresIn().equals(this.getExpiresIn()) == false)
            return false;
        if (other.getResourceIdentifier() == null ^ this.getResourceIdentifier() == null)
            return false;
        if (other.getResourceIdentifier() != null && other.getResourceIdentifier().equals(this.getResourceIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwayFrom() == null) ? 0 : getAwayFrom().hashCode());
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        hashCode = prime * hashCode + ((getExpiresIn() == null) ? 0 : getExpiresIn().hashCode());
        hashCode = prime * hashCode + ((getResourceIdentifier() == null) ? 0 : getResourceIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public StartZonalShiftRequest clone() {
        return (StartZonalShiftRequest) super.clone();
    }

}
