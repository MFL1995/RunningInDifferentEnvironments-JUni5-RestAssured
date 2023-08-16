package communication.request.steering.builder;


import communication.request.steering.pojo.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SteeringBuilder {
    public static SteeringRuleSet steeringSdwanNoCircuitBuilder(SteeringSdwanParams params) {
        return SteeringRuleSet.builder()
                .description(params.saveChangesDescription)
                .sdwan_rules(Arrays.asList(SteeringSdwanRule.builder()
                                .name(params.name)
                                .description(params.ruleDescription)
                                .vpn(params.vpn)
                                .rule_type(params.rule_type)
                                .application(params.application)
                                .protocol(params.protocol)
                                .behaviour(params.behaviour)
                                .evaluate_continuously(params.evaluate_continuously)
                                .editable(params.editable)
                                .priority(params.priority)
                                .avoid_circuit(Collections.emptyList())
                                .circuitPriority(Collections.emptyList())
                                .source(SteeringSource.builder()
                                        .ip(Arrays.asList(params.sourceFirstIp, params.sourceSecondIp))
                                        .port(Arrays.asList(SteeringSourcePort.builder()
                                                        .from(params.sourceFirstFrom)
                                                        .to(params.sourceFirstTo)
                                                        .build(),
                                                SteeringSourcePort.builder()
                                                        .from(params.sourceSecondFrom)
                                                        .to(params.sourceSecondTo)
                                                        .build()))
                                        .build())
                                .destination(SteeringDestination.builder()
                                        .ip(Arrays.asList(params.destinationFirstIp, params.destinationSecondIp))
                                        .port(Arrays.asList(SteeringDestinationPort.builder()
                                                        .from(params.destinationFirstFrom)
                                                        .to(params.destinationFirstTo)
                                                        .build(),
                                                SteeringDestinationPort.builder()
                                                        .from(params.destinationSecondFrom)
                                                        .to(params.destinationSecondTo)
                                                        .build()))
                                        .build())
                                .metrics(Collections.singletonList(SteeringMetrics.builder()
                                        .metric(params.metric)
                                        .threshold(params.threshold)
                                        .build()))
                                .next_hop_details(null)
                                .best_path_selection(null)
                                .isContentVisible(true)
                                .build(),
                        SteeringSdwanRule.builder()
                                .priority(2)
                                .rule_type("PROTOCOL")
                                .vpn("")
                                .name("DEFAULT-TRAFFIC-RULE")
                                .description("DEFAULT-TRAFFIC-RULE")
                                .application(new ArrayList<>())
                                .protocol("ANY")
                                .source(SteeringSource.builder()
                                        .ip(new ArrayList<>())
                                        .port(Collections.emptyList())
                                        .build())
                                .destination(SteeringDestination.builder()
                                        .ip(new ArrayList<>())
                                        .port(Collections.emptyList())
                                        .build())
                                .metrics(new ArrayList<>())
                                .avoid_circuit(new ArrayList<>())
                                .circuitPriority(new ArrayList<>())
                                .editable(false)
                                .evaluate_continuously(false)
                                .behaviour("STEER_TRAFFIC")
                                .zone(null)
                                .next_hop_details(null)
                                .best_path_selection(SteeringBestPathSelection.builder()
                                        .lowest_latency(false)
                                        .lowest_packet_loss(false)
                                        .lowest_jitter(false)
                                        .build())
                                .isContentVisible(true)
                                .build()))
                .internet_rules(Collections.emptyList())
                .saas_rules(Collections.emptyList())
                .build();
    }

    public static SteeringRuleSet steeringSdwanSamePriorityBuilder(SteeringSdwanParams params) {
        return SteeringRuleSet.builder()
                .description(params.saveChangesDescription)
                .sdwan_rules(Arrays.asList(SteeringSdwanRule.builder()
                                .name(params.name)
                                .description(params.ruleDescription)
                                .vpn(params.vpn)
                                .rule_type(params.rule_type)
                                .application(params.application)
                                .protocol(params.protocol)
                                .behaviour(params.behaviour)
                                .evaluate_continuously(params.evaluate_continuously)
                                .editable(params.editable)
                                .priority(params.priority)
                                .avoid_circuit(Collections.emptyList())
                                .circuitPriority(Arrays.asList(SteeringPriorityCircuit.builder()
                                                .value(params.firstPriorityCircuitValue)
                                                .name(params.firstPriorityCircuitName)
                                                .build(),
                                        SteeringPriorityCircuit.builder()
                                                .value(params.secondPriorityCircuitValue)
                                                .name(params.secondPriorityCircuitName)
                                                .build()))
                                .source(SteeringSource.builder()
                                        .ip(Arrays.asList(params.sourceFirstIp, params.sourceSecondIp))
                                        .port(Arrays.asList(SteeringSourcePort.builder()
                                                        .from(params.sourceFirstFrom)
                                                        .to(params.sourceFirstTo)
                                                        .build(),
                                                SteeringSourcePort.builder()
                                                        .from(params.sourceSecondFrom)
                                                        .to(params.sourceSecondTo)
                                                        .build()))
                                        .build())
                                .destination(SteeringDestination.builder()
                                        .ip(Arrays.asList(params.destinationFirstIp, params.destinationSecondIp))
                                        .port(Arrays.asList(SteeringDestinationPort.builder()
                                                        .from(params.destinationFirstFrom)
                                                        .to(params.destinationFirstTo)
                                                        .build(),
                                                SteeringDestinationPort.builder()
                                                        .from(params.destinationSecondFrom)
                                                        .to(params.destinationSecondTo)
                                                        .build()))
                                        .build())
                                .metrics(Collections.singletonList(SteeringMetrics.builder()
                                        .metric(params.metric)
                                        .threshold(params.threshold)
                                        .build()))
                                .next_hop_details(null)
                                .best_path_selection(null)
                                .isContentVisible(true)
                                .build(),
                        SteeringSdwanRule.builder()
                                .priority(2)
                                .rule_type("PROTOCOL")
                                .vpn("")
                                .name("DEFAULT-TRAFFIC-RULE")
                                .description("DEFAULT-TRAFFIC-RULE")
                                .application(new ArrayList<>())
                                .protocol("ANY")
                                .source(SteeringSource.builder()
                                        .ip(new ArrayList<>())
                                        .port(Collections.emptyList())
                                        .build())
                                .destination(SteeringDestination.builder()
                                        .ip(new ArrayList<>())
                                        .port(Collections.emptyList())
                                        .build())
                                .metrics(new ArrayList<>())
                                .avoid_circuit(new ArrayList<>())
                                .circuitPriority(new ArrayList<>())
                                .editable(false)
                                .evaluate_continuously(false)
                                .behaviour("STEER_TRAFFIC")
                                .zone(null)
                                .next_hop_details(null)
                                .best_path_selection(SteeringBestPathSelection.builder()
                                        .lowest_latency(false)
                                        .lowest_packet_loss(false)
                                        .lowest_jitter(false)
                                        .build())
                                .isContentVisible(true)
                                .build()))
                .internet_rules(Collections.emptyList())
                .saas_rules(Collections.emptyList())
                .build();
    }

    public static SteeringRuleSet steeringSdwanOnePriorityOneAvoidBuilder(SteeringSdwanParams params) {
        return SteeringRuleSet.builder()
                .description(params.saveChangesDescription)
                .sdwan_rules(Arrays.asList(SteeringSdwanRule.builder()
                                .name(params.name)
                                .description(params.ruleDescription)
                                .vpn(params.vpn)
                                .rule_type(params.rule_type)
                                .application(params.application)
                                .protocol(params.protocol)
                                .behaviour(params.behaviour)
                                .evaluate_continuously(params.evaluate_continuously)
                                .editable(params.editable)
                                .priority(params.priority)
                                .avoid_circuit(Collections.singletonList(params.firstAvoidCircuit))
                                .circuitPriority(Collections.singletonList(SteeringPriorityCircuit.builder()
                                        .value(params.firstPriorityCircuitValue)
                                        .name(params.firstPriorityCircuitName)
                                        .build()))
                                .source(SteeringSource.builder()
                                        .ip(Arrays.asList(params.sourceFirstIp, params.sourceSecondIp))
                                        .port(Arrays.asList(SteeringSourcePort.builder()
                                                        .from(params.sourceFirstFrom)
                                                        .to(params.sourceFirstTo)
                                                        .build(),
                                                SteeringSourcePort.builder()
                                                        .from(params.sourceSecondFrom)
                                                        .to(params.sourceSecondTo)
                                                        .build()))
                                        .build())
                                .destination(SteeringDestination.builder()
                                        .ip(Arrays.asList(params.destinationFirstIp, params.destinationSecondIp))
                                        .port(Arrays.asList(SteeringDestinationPort.builder()
                                                        .from(params.destinationFirstFrom)
                                                        .to(params.destinationFirstTo)
                                                        .build(),
                                                SteeringDestinationPort.builder()
                                                        .from(params.destinationSecondFrom)
                                                        .to(params.destinationSecondTo)
                                                        .build()))
                                        .build())
                                .metrics(Collections.singletonList(SteeringMetrics.builder()
                                        .metric(params.metric)
                                        .threshold(params.threshold)
                                        .build()))
                                .next_hop_details(null)
                                .best_path_selection(null)
                                .isContentVisible(true)
                                .build(),
                        SteeringSdwanRule.builder()
                                .priority(2)
                                .rule_type("PROTOCOL")
                                .vpn("")
                                .name("DEFAULT-TRAFFIC-RULE")
                                .description("DEFAULT-TRAFFIC-RULE")
                                .application(new ArrayList<>())
                                .protocol("ANY")
                                .source(SteeringSource.builder()
                                        .ip(new ArrayList<>())
                                        .port(Collections.emptyList())
                                        .build())
                                .destination(SteeringDestination.builder()
                                        .ip(new ArrayList<>())
                                        .port(Collections.emptyList())
                                        .build())
                                .metrics(new ArrayList<>())
                                .avoid_circuit(new ArrayList<>())
                                .circuitPriority(new ArrayList<>())
                                .editable(false)
                                .evaluate_continuously(false)
                                .behaviour("STEER_TRAFFIC")
                                .zone(null)
                                .next_hop_details(null)
                                .best_path_selection(SteeringBestPathSelection.builder()
                                        .lowest_latency(false)
                                        .lowest_packet_loss(false)
                                        .lowest_jitter(false)
                                        .build())
                                .isContentVisible(true)
                                .build()))
                .internet_rules(Collections.emptyList())
                .saas_rules(Collections.emptyList())
                .build();
    }

    public static SteeringRuleSet steeringSdwanTwoAvoidBuilder(SteeringSdwanParams params) {
        return SteeringRuleSet.builder()
                .description(params.saveChangesDescription)
                .sdwan_rules(Arrays.asList(SteeringSdwanRule.builder()
                                .name(params.name)
                                .description(params.ruleDescription)
                                .vpn(params.vpn)
                                .rule_type(params.rule_type)
                                .application(params.application)
                                .protocol(params.protocol)
                                .behaviour(params.behaviour)
                                .evaluate_continuously(params.evaluate_continuously)
                                .editable(params.editable)
                                .priority(params.priority)
                                .avoid_circuit(Arrays.asList(params.firstAvoidCircuit, params.secondAvoidCircuit))
                                .circuitPriority(new ArrayList<>())
                                .source(SteeringSource.builder()
                                        .ip(Arrays.asList(params.sourceFirstIp, params.sourceSecondIp))
                                        .port(Arrays.asList(SteeringSourcePort.builder()
                                                        .from(params.sourceFirstFrom)
                                                        .to(params.sourceFirstTo)
                                                        .build(),
                                                SteeringSourcePort.builder()
                                                        .from(params.sourceSecondFrom)
                                                        .to(params.sourceSecondTo)
                                                        .build()))
                                        .build())
                                .destination(SteeringDestination.builder()
                                        .ip(Arrays.asList(params.destinationFirstIp, params.destinationSecondIp))
                                        .port(Arrays.asList(SteeringDestinationPort.builder()
                                                        .from(params.destinationFirstFrom)
                                                        .to(params.destinationFirstTo)
                                                        .build(),
                                                SteeringDestinationPort.builder()
                                                        .from(params.destinationSecondFrom)
                                                        .to(params.destinationSecondTo)
                                                        .build()))
                                        .build())
                                .metrics(Collections.singletonList(SteeringMetrics.builder()
                                        .metric(params.metric)
                                        .threshold(params.threshold)
                                        .build()))
                                .next_hop_details(null)
                                .best_path_selection(null)
                                .isContentVisible(true)
                                .build(),
                        SteeringSdwanRule.builder()
                                .priority(2)
                                .rule_type("PROTOCOL")
                                .vpn("")
                                .name("DEFAULT-TRAFFIC-RULE")
                                .description("DEFAULT-TRAFFIC-RULE")
                                .application(new ArrayList<>())
                                .protocol("ANY")
                                .source(SteeringSource.builder()
                                        .ip(new ArrayList<>())
                                        .port(Collections.emptyList())
                                        .build())
                                .destination(SteeringDestination.builder()
                                        .ip(new ArrayList<>())
                                        .port(Collections.emptyList())
                                        .build())
                                .metrics(new ArrayList<>())
                                .avoid_circuit(new ArrayList<>())
                                .circuitPriority(new ArrayList<>())
                                .editable(false)
                                .evaluate_continuously(false)
                                .behaviour("STEER_TRAFFIC")
                                .zone(null)
                                .next_hop_details(null)
                                .best_path_selection(SteeringBestPathSelection.builder()
                                        .lowest_latency(false)
                                        .lowest_packet_loss(false)
                                        .lowest_jitter(false)
                                        .build())
                                .isContentVisible(true)
                                .build()))
                .internet_rules(Collections.emptyList())
                .saas_rules(Collections.emptyList())
                .build();
    }

    public static SteeringRuleSet steeringDeleteBuilder() {
        return SteeringRuleSet.builder()
                .description("Deletion of Steering Rule")
                .sdwan_rules(Collections.singletonList(SteeringSdwanRule.builder()
                        .priority(2)
                        .rule_type("PROTOCOL")
                        .vpn("")
                        .name("DEFAULT-TRAFFIC-RULE")
                        .description("DEFAULT-TRAFFIC-RULE")
                        .application(new ArrayList<>())
                        .protocol("ANY")
                        .source(SteeringSource.builder()
                                .ip(new ArrayList<>())
                                .port(Collections.emptyList())
                                .build())
                        .destination(SteeringDestination.builder()
                                .ip(new ArrayList<>())
                                .port(Collections.emptyList())
                                .build())
                        .metrics(new ArrayList<>())
                        .avoid_circuit(new ArrayList<>())
                        .circuitPriority(new ArrayList<>())
                        .editable(false)
                        .evaluate_continuously(false)
                        .behaviour("STEER_TRAFFIC")
                        .zone(null)
                        .next_hop_details(null)
                        .best_path_selection(SteeringBestPathSelection.builder()
                                .lowest_latency(false)
                                .lowest_packet_loss(false)
                                .lowest_jitter(false)
                                .build())
                        .isContentVisible(true)

                        .build()))
                .internet_rules(Collections.emptyList())
                .saas_rules(Collections.emptyList())
                .build();
    }

    public static SteeringRuleSet steeringInternetBuilder(SteeringInternetParams params) {
        return SteeringRuleSet.builder()
                .description("New Steering Rule")
                .sdwan_rules(Collections.singletonList(SteeringSdwanRule.builder()
                        .priority(2)
                        .rule_type("PROTOCOL")
                        .vpn("")
                        .name("DEFAULT-TRAFFIC-RULE")
                        .description("DEFAULT-TRAFFIC-RULE")
                        .application(new ArrayList<>())
                        .protocol("ANY")
                        .source(SteeringSource.builder()
                                .ip(new ArrayList<>())
                                .port(Collections.emptyList())
                                .build())
                        .destination(SteeringDestination.builder()
                                .ip(new ArrayList<>())
                                .port(Collections.emptyList())
                                .build())
                        .metrics(new ArrayList<>())
                        .avoid_circuit(new ArrayList<>())
                        .circuitPriority(new ArrayList<>())
                        .editable(false)
                        .evaluate_continuously(false)
                        .behaviour("STEER_TRAFFIC")
                        .zone(null)
                        .next_hop_details(null)
                        .best_path_selection(SteeringBestPathSelection.builder()
                                .lowest_latency(false)
                                .lowest_packet_loss(false)
                                .lowest_jitter(false)
                                .build())
                        .isContentVisible(true)
                        .build()))
                .internet_rules(Collections.singletonList(SteeringInternetRules.builder()
                        .priority(params.priority)
                        .name(params.name)
                        .description(params.ruleDescription)
                        .application(Arrays.asList(params.application, params.application))
                        .rule_type(params.rule_type)
                        .vpn(params.vpn)
                        .breakout_priorities(Collections.singletonList(SteeringBreakoutPriorities.builder()
                                .breakout_type(params.breakout_type)
                                .priority(params.breakoutTypePriority)
                                .local_interface(params.local_interface)
                                .remote_gateway(null)
                                .build()))
                        .isContentVisible(true)
                        .build()))
                .saas_rules(Collections.emptyList())
                .build();
    }


    public static SteeringRuleSet steeringSaasBuilder(SteeringSaasParams params) {
        return SteeringRuleSet.builder()
                .description("New Steering Rule")
                .sdwan_rules(Collections.singletonList(SteeringSdwanRule.builder()
                        .priority(2)
                        .rule_type("PROTOCOL")
                        .vpn("")
                        .name("DEFAULT-TRAFFIC-RULE")
                        .description("DEFAULT-TRAFFIC-RULE")
                        .application(new ArrayList<>())
                        .protocol("ANY")
                        .source(SteeringSource.builder()
                                .ip(new ArrayList<>())
                                .port(Collections.emptyList())
                                .build())
                        .destination(SteeringDestination.builder()
                                .ip(new ArrayList<>())
                                .port(Collections.emptyList())
                                .build())
                        .metrics(new ArrayList<>())
                        .avoid_circuit(new ArrayList<>())
                        .circuitPriority(new ArrayList<>())
                        .editable(false)
                        .evaluate_continuously(false)
                        .behaviour("STEER_TRAFFIC")
                        .zone(null)
                        .next_hop_details(null)
                        .best_path_selection(SteeringBestPathSelection.builder()
                                .lowest_latency(false)
                                .lowest_packet_loss(false)
                                .lowest_jitter(false)
                                .build())
                        .isContentVisible(true)
                        .build()))
                .internet_rules(Collections.emptyList())
                .saas_rules(Collections.singletonList(SteeringSaasRule.builder()
                        .priority(params.priority)
                        .max_latency(params.max_latency)
                        .max_packet_loss(params.max_packet_loss)
                        .network(params.network)
                        .saas_application(params.saas_application)
                        .saas_application_fqdn(params.saas_application_fqdn)
                        .sla_next_hops(Collections.singletonList(SlaNextHops.builder()
                                        .breakout_type(params.breakout_type)
                                        .slaNextHopsPriority(params.slaNextHopsPriority)
                                        .local_interface(params.local_interface)
                                        .remote_gateway(null)
                                .build()))
                        .build()))
                .build();
    }

}
/*

{
   "description":"commit changes",
   "sdwan_rules":[
      {
         "name":"SdwanName",
         "description":"Sdwan Description",
         "vpn":"LAN1",
         "rule_type":"PROTOCOL",
         "application":[

         ],
         "protocol":"TCP",
         "behaviour":"STEER_TRAFFIC_AND_REPLICATION_ALWAYS",
         "evaluate_continuously":true,
         "editable":true,
         "priority":1,
         "avoid_circuit":[],
         "circuitPriorityList":[],
         "source":{},
         "destination":{},
         "metrics":[
            {
               "metric":"LOSS_PERCENTAGE",
               "threshold":25
            }
         ],
         "next_hop_details":null,
         "best_path_selection":null,
         "isContentVisible":true
      },
      {
         "priority":2,
         "rule_type":"PROTOCOL",
         "vpn":"",
         "name":"DEFAULT-TRAFFIC-RULE",
         "description":"DEFAULT-TRAFFIC-RULE",
         "application":[

         ],
         "protocol":"ANY",
         "source":{
            "ip":[

            ],
            "port":[

            ]
         },
         "destination":{
            "ip":[

            ],
            "port":[

            ]
         },
         "metrics":[

         ],
         "avoid_circuit":[

         ],
         "circuitPriorityList":[

         ],
         "editable":false,
         "evaluate_continuously":false,
         "behaviour":"STEER_TRAFFIC",
         "zone":null,
         "next_hop_details":null,
         "best_path_selection":{
            "lowest_latency":false,
            "lowest_packet_loss":false,
            "lowest_jitter":false
         },
         "isContentVisible":true
      }
   ],
   "internet_rules":[

   ],
   "saas_rules":[

   ]
}
*/

