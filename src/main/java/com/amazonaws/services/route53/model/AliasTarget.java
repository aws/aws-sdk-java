/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.route53.model;

import java.io.Serializable;


/**
 * <p>
 * <i>Alias resource record sets only:</i> Information about the domain to which you are redirecting traffic.
 * </p>
 * <p>
 * For more information and an example, see <a href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/CreatingAliasRRSets.html"> Creating Alias
 * Resource Record Sets </a> in the <i>Amazon Route 53 Developer Guide</i>
 * </p>
 * <p>
 * .
 * </p>
 */
public class AliasTarget implements Serializable {

    /**
     * <i>Alias resource record sets only:</i> The value of the hosted zone
     * ID for the AWS resource. <p>For more information and an example, see
     * <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/CreatingAliasRRSets.html">Creating
     * Alias Resource Record Sets</a> in the <i>Amazon Route 53 Developer
     * Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32<br/>
     */
    private String hostedZoneId;

    /**
     * <i>Alias resource record sets only:</i> The external DNS name
     * associated with the AWS Resource. <p>For more information and an
     * example, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/CreatingAliasRRSets.html">Creating
     * Alias Resource Record Sets</a> in the <i>Amazon Route 53 Developer
     * Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     */
    private String dNSName;

    /**
     * <i>Alias resource record sets only:</i> A boolean value that indicates
     * whether this Resource Record Set should respect the health status of
     * any health checks associated with the ALIAS target record which it is
     * linked to. <p>For more information and an example, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/CreatingAliasRRSets.html">Creating
     * Alias Resource Record Sets</a> in the <i>Amazon Route 53 Developer
     * Guide</i>.
     */
    private Boolean evaluateTargetHealth;

    /**
     * Default constructor for a new AliasTarget object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public AliasTarget() {}
    
    /**
     * Constructs a new AliasTarget object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param hostedZoneId <i>Alias resource record sets only:</i> The value
     * of the hosted zone ID for the AWS resource. <p>For more information
     * and an example, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/CreatingAliasRRSets.html">Creating
     * Alias Resource Record Sets</a> in the <i>Amazon Route 53 Developer
     * Guide</i>.
     * @param dNSName <i>Alias resource record sets only:</i> The external
     * DNS name associated with the AWS Resource. <p>For more information and
     * an example, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/CreatingAliasRRSets.html">Creating
     * Alias Resource Record Sets</a> in the <i>Amazon Route 53 Developer
     * Guide</i>.
     */
    public AliasTarget(String hostedZoneId, String dNSName) {
        setHostedZoneId(hostedZoneId);
        setDNSName(dNSName);
    }

    /**
     * <i>Alias resource record sets only:</i> The value of the hosted zone
     * ID for the AWS resource. <p>For more information and an example, see
     * <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/CreatingAliasRRSets.html">Creating
     * Alias Resource Record Sets</a> in the <i>Amazon Route 53 Developer
     * Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32<br/>
     *
     * @return <i>Alias resource record sets only:</i> The value of the hosted zone
     *         ID for the AWS resource. <p>For more information and an example, see
     *         <a
     *         href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/CreatingAliasRRSets.html">Creating
     *         Alias Resource Record Sets</a> in the <i>Amazon Route 53 Developer
     *         Guide</i>.
     */
    public String getHostedZoneId() {
        return hostedZoneId;
    }
    
    /**
     * <i>Alias resource record sets only:</i> The value of the hosted zone
     * ID for the AWS resource. <p>For more information and an example, see
     * <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/CreatingAliasRRSets.html">Creating
     * Alias Resource Record Sets</a> in the <i>Amazon Route 53 Developer
     * Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32<br/>
     *
     * @param hostedZoneId <i>Alias resource record sets only:</i> The value of the hosted zone
     *         ID for the AWS resource. <p>For more information and an example, see
     *         <a
     *         href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/CreatingAliasRRSets.html">Creating
     *         Alias Resource Record Sets</a> in the <i>Amazon Route 53 Developer
     *         Guide</i>.
     */
    public void setHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
    }
    
    /**
     * <i>Alias resource record sets only:</i> The value of the hosted zone
     * ID for the AWS resource. <p>For more information and an example, see
     * <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/CreatingAliasRRSets.html">Creating
     * Alias Resource Record Sets</a> in the <i>Amazon Route 53 Developer
     * Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32<br/>
     *
     * @param hostedZoneId <i>Alias resource record sets only:</i> The value of the hosted zone
     *         ID for the AWS resource. <p>For more information and an example, see
     *         <a
     *         href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/CreatingAliasRRSets.html">Creating
     *         Alias Resource Record Sets</a> in the <i>Amazon Route 53 Developer
     *         Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AliasTarget withHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
        return this;
    }

    /**
     * <i>Alias resource record sets only:</i> The external DNS name
     * associated with the AWS Resource. <p>For more information and an
     * example, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/CreatingAliasRRSets.html">Creating
     * Alias Resource Record Sets</a> in the <i>Amazon Route 53 Developer
     * Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @return <i>Alias resource record sets only:</i> The external DNS name
     *         associated with the AWS Resource. <p>For more information and an
     *         example, see <a
     *         href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/CreatingAliasRRSets.html">Creating
     *         Alias Resource Record Sets</a> in the <i>Amazon Route 53 Developer
     *         Guide</i>.
     */
    public String getDNSName() {
        return dNSName;
    }
    
    /**
     * <i>Alias resource record sets only:</i> The external DNS name
     * associated with the AWS Resource. <p>For more information and an
     * example, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/CreatingAliasRRSets.html">Creating
     * Alias Resource Record Sets</a> in the <i>Amazon Route 53 Developer
     * Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param dNSName <i>Alias resource record sets only:</i> The external DNS name
     *         associated with the AWS Resource. <p>For more information and an
     *         example, see <a
     *         href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/CreatingAliasRRSets.html">Creating
     *         Alias Resource Record Sets</a> in the <i>Amazon Route 53 Developer
     *         Guide</i>.
     */
    public void setDNSName(String dNSName) {
        this.dNSName = dNSName;
    }
    
    /**
     * <i>Alias resource record sets only:</i> The external DNS name
     * associated with the AWS Resource. <p>For more information and an
     * example, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/CreatingAliasRRSets.html">Creating
     * Alias Resource Record Sets</a> in the <i>Amazon Route 53 Developer
     * Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param dNSName <i>Alias resource record sets only:</i> The external DNS name
     *         associated with the AWS Resource. <p>For more information and an
     *         example, see <a
     *         href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/CreatingAliasRRSets.html">Creating
     *         Alias Resource Record Sets</a> in the <i>Amazon Route 53 Developer
     *         Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AliasTarget withDNSName(String dNSName) {
        this.dNSName = dNSName;
        return this;
    }

    /**
     * <i>Alias resource record sets only:</i> A boolean value that indicates
     * whether this Resource Record Set should respect the health status of
     * any health checks associated with the ALIAS target record which it is
     * linked to. <p>For more information and an example, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/CreatingAliasRRSets.html">Creating
     * Alias Resource Record Sets</a> in the <i>Amazon Route 53 Developer
     * Guide</i>.
     *
     * @return <i>Alias resource record sets only:</i> A boolean value that indicates
     *         whether this Resource Record Set should respect the health status of
     *         any health checks associated with the ALIAS target record which it is
     *         linked to. <p>For more information and an example, see <a
     *         href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/CreatingAliasRRSets.html">Creating
     *         Alias Resource Record Sets</a> in the <i>Amazon Route 53 Developer
     *         Guide</i>.
     */
    public Boolean isEvaluateTargetHealth() {
        return evaluateTargetHealth;
    }
    
    /**
     * <i>Alias resource record sets only:</i> A boolean value that indicates
     * whether this Resource Record Set should respect the health status of
     * any health checks associated with the ALIAS target record which it is
     * linked to. <p>For more information and an example, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/CreatingAliasRRSets.html">Creating
     * Alias Resource Record Sets</a> in the <i>Amazon Route 53 Developer
     * Guide</i>.
     *
     * @param evaluateTargetHealth <i>Alias resource record sets only:</i> A boolean value that indicates
     *         whether this Resource Record Set should respect the health status of
     *         any health checks associated with the ALIAS target record which it is
     *         linked to. <p>For more information and an example, see <a
     *         href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/CreatingAliasRRSets.html">Creating
     *         Alias Resource Record Sets</a> in the <i>Amazon Route 53 Developer
     *         Guide</i>.
     */
    public void setEvaluateTargetHealth(Boolean evaluateTargetHealth) {
        this.evaluateTargetHealth = evaluateTargetHealth;
    }
    
    /**
     * <i>Alias resource record sets only:</i> A boolean value that indicates
     * whether this Resource Record Set should respect the health status of
     * any health checks associated with the ALIAS target record which it is
     * linked to. <p>For more information and an example, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/CreatingAliasRRSets.html">Creating
     * Alias Resource Record Sets</a> in the <i>Amazon Route 53 Developer
     * Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param evaluateTargetHealth <i>Alias resource record sets only:</i> A boolean value that indicates
     *         whether this Resource Record Set should respect the health status of
     *         any health checks associated with the ALIAS target record which it is
     *         linked to. <p>For more information and an example, see <a
     *         href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/CreatingAliasRRSets.html">Creating
     *         Alias Resource Record Sets</a> in the <i>Amazon Route 53 Developer
     *         Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AliasTarget withEvaluateTargetHealth(Boolean evaluateTargetHealth) {
        this.evaluateTargetHealth = evaluateTargetHealth;
        return this;
    }

    /**
     * <i>Alias resource record sets only:</i> A boolean value that indicates
     * whether this Resource Record Set should respect the health status of
     * any health checks associated with the ALIAS target record which it is
     * linked to. <p>For more information and an example, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/CreatingAliasRRSets.html">Creating
     * Alias Resource Record Sets</a> in the <i>Amazon Route 53 Developer
     * Guide</i>.
     *
     * @return <i>Alias resource record sets only:</i> A boolean value that indicates
     *         whether this Resource Record Set should respect the health status of
     *         any health checks associated with the ALIAS target record which it is
     *         linked to. <p>For more information and an example, see <a
     *         href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/CreatingAliasRRSets.html">Creating
     *         Alias Resource Record Sets</a> in the <i>Amazon Route 53 Developer
     *         Guide</i>.
     */
    public Boolean getEvaluateTargetHealth() {
        return evaluateTargetHealth;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getHostedZoneId() != null) sb.append("HostedZoneId: " + getHostedZoneId() + ",");
        if (getDNSName() != null) sb.append("DNSName: " + getDNSName() + ",");
        if (isEvaluateTargetHealth() != null) sb.append("EvaluateTargetHealth: " + isEvaluateTargetHealth() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getHostedZoneId() == null) ? 0 : getHostedZoneId().hashCode()); 
        hashCode = prime * hashCode + ((getDNSName() == null) ? 0 : getDNSName().hashCode()); 
        hashCode = prime * hashCode + ((isEvaluateTargetHealth() == null) ? 0 : isEvaluateTargetHealth().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AliasTarget == false) return false;
        AliasTarget other = (AliasTarget)obj;
        
        if (other.getHostedZoneId() == null ^ this.getHostedZoneId() == null) return false;
        if (other.getHostedZoneId() != null && other.getHostedZoneId().equals(this.getHostedZoneId()) == false) return false; 
        if (other.getDNSName() == null ^ this.getDNSName() == null) return false;
        if (other.getDNSName() != null && other.getDNSName().equals(this.getDNSName()) == false) return false; 
        if (other.isEvaluateTargetHealth() == null ^ this.isEvaluateTargetHealth() == null) return false;
        if (other.isEvaluateTargetHealth() != null && other.isEvaluateTargetHealth().equals(this.isEvaluateTargetHealth()) == false) return false; 
        return true;
    }
    
}
    