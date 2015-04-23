/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticloadbalancing.model;

import java.io.Serializable;

/**
 * <p>
 * Information about a health check.
 * </p>
 */
public class HealthCheck implements Serializable, Cloneable {

    /**
     * The instance being checked. The protocol is either TCP, HTTP, HTTPS,
     * or SSL. The range of valid ports is one (1) through 65535. <p>TCP is
     * the default, specified as a TCP: port pair, for example "TCP:5000". In
     * this case, a health check simply attempts to open a TCP connection to
     * the instance on the specified port. Failure to connect within the
     * configured timeout is considered unhealthy. <p>SSL is also specified
     * as SSL: port pair, for example, SSL:5000. <p>For HTTP/HTTPS, you must
     * include a ping path in the string. HTTP is specified as a
     * HTTP:port;/;PathToPing; grouping, for example
     * "HTTP:80/weather/us/wa/seattle". In this case, a HTTP GET request is
     * issued to the instance on the given port and path. Any answer other
     * than "200 OK" within the timeout period is considered unhealthy.
     * <p>The total length of the HTTP ping target must be 1024 16-bit
     * Unicode characters or less.
     */
    private String target;

    /**
     * The approximate interval, in seconds, between health checks of an
     * individual instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 300<br/>
     */
    private Integer interval;

    /**
     * The amount of time, in seconds, during which no response means a
     * failed health check. <p>This value must be less than the
     * <code>Interval</code> value.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 300<br/>
     */
    private Integer timeout;

    /**
     * The number of consecutive health check failures required before moving
     * the instance to the <code>Unhealthy</code> state.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>2 - 10<br/>
     */
    private Integer unhealthyThreshold;

    /**
     * The number of consecutive health checks successes required before
     * moving the instance to the <code>Healthy</code> state.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>2 - 10<br/>
     */
    private Integer healthyThreshold;

    /**
     * Default constructor for a new HealthCheck object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public HealthCheck() {}
    
    /**
     * Constructs a new HealthCheck object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param target The instance being checked. The protocol is either TCP,
     * HTTP, HTTPS, or SSL. The range of valid ports is one (1) through
     * 65535. <p>TCP is the default, specified as a TCP: port pair, for
     * example "TCP:5000". In this case, a health check simply attempts to
     * open a TCP connection to the instance on the specified port. Failure
     * to connect within the configured timeout is considered unhealthy.
     * <p>SSL is also specified as SSL: port pair, for example, SSL:5000.
     * <p>For HTTP/HTTPS, you must include a ping path in the string. HTTP is
     * specified as a HTTP:port;/;PathToPing; grouping, for example
     * "HTTP:80/weather/us/wa/seattle". In this case, a HTTP GET request is
     * issued to the instance on the given port and path. Any answer other
     * than "200 OK" within the timeout period is considered unhealthy.
     * <p>The total length of the HTTP ping target must be 1024 16-bit
     * Unicode characters or less.
     * @param interval The approximate interval, in seconds, between health
     * checks of an individual instance.
     * @param timeout The amount of time, in seconds, during which no
     * response means a failed health check. <p>This value must be less than
     * the <code>Interval</code> value.
     * @param unhealthyThreshold The number of consecutive health check
     * failures required before moving the instance to the
     * <code>Unhealthy</code> state.
     * @param healthyThreshold The number of consecutive health checks
     * successes required before moving the instance to the
     * <code>Healthy</code> state.
     */
    public HealthCheck(String target, Integer interval, Integer timeout, Integer unhealthyThreshold, Integer healthyThreshold) {
        setTarget(target);
        setInterval(interval);
        setTimeout(timeout);
        setUnhealthyThreshold(unhealthyThreshold);
        setHealthyThreshold(healthyThreshold);
    }

    /**
     * The instance being checked. The protocol is either TCP, HTTP, HTTPS,
     * or SSL. The range of valid ports is one (1) through 65535. <p>TCP is
     * the default, specified as a TCP: port pair, for example "TCP:5000". In
     * this case, a health check simply attempts to open a TCP connection to
     * the instance on the specified port. Failure to connect within the
     * configured timeout is considered unhealthy. <p>SSL is also specified
     * as SSL: port pair, for example, SSL:5000. <p>For HTTP/HTTPS, you must
     * include a ping path in the string. HTTP is specified as a
     * HTTP:port;/;PathToPing; grouping, for example
     * "HTTP:80/weather/us/wa/seattle". In this case, a HTTP GET request is
     * issued to the instance on the given port and path. Any answer other
     * than "200 OK" within the timeout period is considered unhealthy.
     * <p>The total length of the HTTP ping target must be 1024 16-bit
     * Unicode characters or less.
     *
     * @return The instance being checked. The protocol is either TCP, HTTP, HTTPS,
     *         or SSL. The range of valid ports is one (1) through 65535. <p>TCP is
     *         the default, specified as a TCP: port pair, for example "TCP:5000". In
     *         this case, a health check simply attempts to open a TCP connection to
     *         the instance on the specified port. Failure to connect within the
     *         configured timeout is considered unhealthy. <p>SSL is also specified
     *         as SSL: port pair, for example, SSL:5000. <p>For HTTP/HTTPS, you must
     *         include a ping path in the string. HTTP is specified as a
     *         HTTP:port;/;PathToPing; grouping, for example
     *         "HTTP:80/weather/us/wa/seattle". In this case, a HTTP GET request is
     *         issued to the instance on the given port and path. Any answer other
     *         than "200 OK" within the timeout period is considered unhealthy.
     *         <p>The total length of the HTTP ping target must be 1024 16-bit
     *         Unicode characters or less.
     */
    public String getTarget() {
        return target;
    }
    
    /**
     * The instance being checked. The protocol is either TCP, HTTP, HTTPS,
     * or SSL. The range of valid ports is one (1) through 65535. <p>TCP is
     * the default, specified as a TCP: port pair, for example "TCP:5000". In
     * this case, a health check simply attempts to open a TCP connection to
     * the instance on the specified port. Failure to connect within the
     * configured timeout is considered unhealthy. <p>SSL is also specified
     * as SSL: port pair, for example, SSL:5000. <p>For HTTP/HTTPS, you must
     * include a ping path in the string. HTTP is specified as a
     * HTTP:port;/;PathToPing; grouping, for example
     * "HTTP:80/weather/us/wa/seattle". In this case, a HTTP GET request is
     * issued to the instance on the given port and path. Any answer other
     * than "200 OK" within the timeout period is considered unhealthy.
     * <p>The total length of the HTTP ping target must be 1024 16-bit
     * Unicode characters or less.
     *
     * @param target The instance being checked. The protocol is either TCP, HTTP, HTTPS,
     *         or SSL. The range of valid ports is one (1) through 65535. <p>TCP is
     *         the default, specified as a TCP: port pair, for example "TCP:5000". In
     *         this case, a health check simply attempts to open a TCP connection to
     *         the instance on the specified port. Failure to connect within the
     *         configured timeout is considered unhealthy. <p>SSL is also specified
     *         as SSL: port pair, for example, SSL:5000. <p>For HTTP/HTTPS, you must
     *         include a ping path in the string. HTTP is specified as a
     *         HTTP:port;/;PathToPing; grouping, for example
     *         "HTTP:80/weather/us/wa/seattle". In this case, a HTTP GET request is
     *         issued to the instance on the given port and path. Any answer other
     *         than "200 OK" within the timeout period is considered unhealthy.
     *         <p>The total length of the HTTP ping target must be 1024 16-bit
     *         Unicode characters or less.
     */
    public void setTarget(String target) {
        this.target = target;
    }
    
    /**
     * The instance being checked. The protocol is either TCP, HTTP, HTTPS,
     * or SSL. The range of valid ports is one (1) through 65535. <p>TCP is
     * the default, specified as a TCP: port pair, for example "TCP:5000". In
     * this case, a health check simply attempts to open a TCP connection to
     * the instance on the specified port. Failure to connect within the
     * configured timeout is considered unhealthy. <p>SSL is also specified
     * as SSL: port pair, for example, SSL:5000. <p>For HTTP/HTTPS, you must
     * include a ping path in the string. HTTP is specified as a
     * HTTP:port;/;PathToPing; grouping, for example
     * "HTTP:80/weather/us/wa/seattle". In this case, a HTTP GET request is
     * issued to the instance on the given port and path. Any answer other
     * than "200 OK" within the timeout period is considered unhealthy.
     * <p>The total length of the HTTP ping target must be 1024 16-bit
     * Unicode characters or less.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param target The instance being checked. The protocol is either TCP, HTTP, HTTPS,
     *         or SSL. The range of valid ports is one (1) through 65535. <p>TCP is
     *         the default, specified as a TCP: port pair, for example "TCP:5000". In
     *         this case, a health check simply attempts to open a TCP connection to
     *         the instance on the specified port. Failure to connect within the
     *         configured timeout is considered unhealthy. <p>SSL is also specified
     *         as SSL: port pair, for example, SSL:5000. <p>For HTTP/HTTPS, you must
     *         include a ping path in the string. HTTP is specified as a
     *         HTTP:port;/;PathToPing; grouping, for example
     *         "HTTP:80/weather/us/wa/seattle". In this case, a HTTP GET request is
     *         issued to the instance on the given port and path. Any answer other
     *         than "200 OK" within the timeout period is considered unhealthy.
     *         <p>The total length of the HTTP ping target must be 1024 16-bit
     *         Unicode characters or less.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public HealthCheck withTarget(String target) {
        this.target = target;
        return this;
    }

    /**
     * The approximate interval, in seconds, between health checks of an
     * individual instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 300<br/>
     *
     * @return The approximate interval, in seconds, between health checks of an
     *         individual instance.
     */
    public Integer getInterval() {
        return interval;
    }
    
    /**
     * The approximate interval, in seconds, between health checks of an
     * individual instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 300<br/>
     *
     * @param interval The approximate interval, in seconds, between health checks of an
     *         individual instance.
     */
    public void setInterval(Integer interval) {
        this.interval = interval;
    }
    
    /**
     * The approximate interval, in seconds, between health checks of an
     * individual instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 300<br/>
     *
     * @param interval The approximate interval, in seconds, between health checks of an
     *         individual instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public HealthCheck withInterval(Integer interval) {
        this.interval = interval;
        return this;
    }

    /**
     * The amount of time, in seconds, during which no response means a
     * failed health check. <p>This value must be less than the
     * <code>Interval</code> value.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 300<br/>
     *
     * @return The amount of time, in seconds, during which no response means a
     *         failed health check. <p>This value must be less than the
     *         <code>Interval</code> value.
     */
    public Integer getTimeout() {
        return timeout;
    }
    
    /**
     * The amount of time, in seconds, during which no response means a
     * failed health check. <p>This value must be less than the
     * <code>Interval</code> value.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 300<br/>
     *
     * @param timeout The amount of time, in seconds, during which no response means a
     *         failed health check. <p>This value must be less than the
     *         <code>Interval</code> value.
     */
    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }
    
    /**
     * The amount of time, in seconds, during which no response means a
     * failed health check. <p>This value must be less than the
     * <code>Interval</code> value.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 300<br/>
     *
     * @param timeout The amount of time, in seconds, during which no response means a
     *         failed health check. <p>This value must be less than the
     *         <code>Interval</code> value.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public HealthCheck withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * The number of consecutive health check failures required before moving
     * the instance to the <code>Unhealthy</code> state.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>2 - 10<br/>
     *
     * @return The number of consecutive health check failures required before moving
     *         the instance to the <code>Unhealthy</code> state.
     */
    public Integer getUnhealthyThreshold() {
        return unhealthyThreshold;
    }
    
    /**
     * The number of consecutive health check failures required before moving
     * the instance to the <code>Unhealthy</code> state.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>2 - 10<br/>
     *
     * @param unhealthyThreshold The number of consecutive health check failures required before moving
     *         the instance to the <code>Unhealthy</code> state.
     */
    public void setUnhealthyThreshold(Integer unhealthyThreshold) {
        this.unhealthyThreshold = unhealthyThreshold;
    }
    
    /**
     * The number of consecutive health check failures required before moving
     * the instance to the <code>Unhealthy</code> state.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>2 - 10<br/>
     *
     * @param unhealthyThreshold The number of consecutive health check failures required before moving
     *         the instance to the <code>Unhealthy</code> state.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public HealthCheck withUnhealthyThreshold(Integer unhealthyThreshold) {
        this.unhealthyThreshold = unhealthyThreshold;
        return this;
    }

    /**
     * The number of consecutive health checks successes required before
     * moving the instance to the <code>Healthy</code> state.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>2 - 10<br/>
     *
     * @return The number of consecutive health checks successes required before
     *         moving the instance to the <code>Healthy</code> state.
     */
    public Integer getHealthyThreshold() {
        return healthyThreshold;
    }
    
    /**
     * The number of consecutive health checks successes required before
     * moving the instance to the <code>Healthy</code> state.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>2 - 10<br/>
     *
     * @param healthyThreshold The number of consecutive health checks successes required before
     *         moving the instance to the <code>Healthy</code> state.
     */
    public void setHealthyThreshold(Integer healthyThreshold) {
        this.healthyThreshold = healthyThreshold;
    }
    
    /**
     * The number of consecutive health checks successes required before
     * moving the instance to the <code>Healthy</code> state.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>2 - 10<br/>
     *
     * @param healthyThreshold The number of consecutive health checks successes required before
     *         moving the instance to the <code>Healthy</code> state.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public HealthCheck withHealthyThreshold(Integer healthyThreshold) {
        this.healthyThreshold = healthyThreshold;
        return this;
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
        if (getTarget() != null) sb.append("Target: " + getTarget() + ",");
        if (getInterval() != null) sb.append("Interval: " + getInterval() + ",");
        if (getTimeout() != null) sb.append("Timeout: " + getTimeout() + ",");
        if (getUnhealthyThreshold() != null) sb.append("UnhealthyThreshold: " + getUnhealthyThreshold() + ",");
        if (getHealthyThreshold() != null) sb.append("HealthyThreshold: " + getHealthyThreshold() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode()); 
        hashCode = prime * hashCode + ((getInterval() == null) ? 0 : getInterval().hashCode()); 
        hashCode = prime * hashCode + ((getTimeout() == null) ? 0 : getTimeout().hashCode()); 
        hashCode = prime * hashCode + ((getUnhealthyThreshold() == null) ? 0 : getUnhealthyThreshold().hashCode()); 
        hashCode = prime * hashCode + ((getHealthyThreshold() == null) ? 0 : getHealthyThreshold().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof HealthCheck == false) return false;
        HealthCheck other = (HealthCheck)obj;
        
        if (other.getTarget() == null ^ this.getTarget() == null) return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false) return false; 
        if (other.getInterval() == null ^ this.getInterval() == null) return false;
        if (other.getInterval() != null && other.getInterval().equals(this.getInterval()) == false) return false; 
        if (other.getTimeout() == null ^ this.getTimeout() == null) return false;
        if (other.getTimeout() != null && other.getTimeout().equals(this.getTimeout()) == false) return false; 
        if (other.getUnhealthyThreshold() == null ^ this.getUnhealthyThreshold() == null) return false;
        if (other.getUnhealthyThreshold() != null && other.getUnhealthyThreshold().equals(this.getUnhealthyThreshold()) == false) return false; 
        if (other.getHealthyThreshold() == null ^ this.getHealthyThreshold() == null) return false;
        if (other.getHealthyThreshold() != null && other.getHealthyThreshold().equals(this.getHealthyThreshold()) == false) return false; 
        return true;
    }
    
    @Override
    public HealthCheck clone() {
        try {
            return (HealthCheck) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    