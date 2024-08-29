// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Create a new Gateway for existing subnet in the specified public cloud project.
 *
 * ## Import
 *
 * A gateway can be imported using the `service_name`, `region` and `id` (identifier of the gateway) properties, separated by a `/`.
 *
 * bash
 *
 * ```sh
 * $ pulumi import ovh:CloudProject/gateway:Gateway gateway service_name/region/id
 * ```
 */
export class Gateway extends pulumi.CustomResource {
    /**
     * Get an existing Gateway resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: GatewayState, opts?: pulumi.CustomResourceOptions): Gateway {
        return new Gateway(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'ovh:CloudProject/gateway:Gateway';

    /**
     * Returns true if the given object is an instance of Gateway.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Gateway {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Gateway.__pulumiType;
    }

    /**
     * List of External Information of the gateway.
     */
    public /*out*/ readonly externalInformations!: pulumi.Output<outputs.CloudProject.GatewayExternalInformation[]>;
    /**
     * Interfaces list of the gateway.
     */
    public /*out*/ readonly interfaces!: pulumi.Output<outputs.CloudProject.GatewayInterface[]>;
    /**
     * Model of the gateway.
     */
    public readonly model!: pulumi.Output<string>;
    /**
     * Name of the gateway.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * ID of the private network.
     */
    public readonly networkId!: pulumi.Output<string>;
    /**
     * Region of the gateway.
     */
    public readonly region!: pulumi.Output<string>;
    /**
     * ID of the private network.
     */
    public readonly serviceName!: pulumi.Output<string>;
    /**
     * Status of the gateway.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * ID of the subnet.
     */
    public readonly subnetId!: pulumi.Output<string>;

    /**
     * Create a Gateway resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: GatewayArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: GatewayArgs | GatewayState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as GatewayState | undefined;
            resourceInputs["externalInformations"] = state ? state.externalInformations : undefined;
            resourceInputs["interfaces"] = state ? state.interfaces : undefined;
            resourceInputs["model"] = state ? state.model : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["networkId"] = state ? state.networkId : undefined;
            resourceInputs["region"] = state ? state.region : undefined;
            resourceInputs["serviceName"] = state ? state.serviceName : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["subnetId"] = state ? state.subnetId : undefined;
        } else {
            const args = argsOrState as GatewayArgs | undefined;
            if ((!args || args.model === undefined) && !opts.urn) {
                throw new Error("Missing required property 'model'");
            }
            if ((!args || args.networkId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'networkId'");
            }
            if ((!args || args.region === undefined) && !opts.urn) {
                throw new Error("Missing required property 'region'");
            }
            if ((!args || args.serviceName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'serviceName'");
            }
            if ((!args || args.subnetId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'subnetId'");
            }
            resourceInputs["model"] = args ? args.model : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["networkId"] = args ? args.networkId : undefined;
            resourceInputs["region"] = args ? args.region : undefined;
            resourceInputs["serviceName"] = args ? args.serviceName : undefined;
            resourceInputs["subnetId"] = args ? args.subnetId : undefined;
            resourceInputs["externalInformations"] = undefined /*out*/;
            resourceInputs["interfaces"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Gateway.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Gateway resources.
 */
export interface GatewayState {
    /**
     * List of External Information of the gateway.
     */
    externalInformations?: pulumi.Input<pulumi.Input<inputs.CloudProject.GatewayExternalInformation>[]>;
    /**
     * Interfaces list of the gateway.
     */
    interfaces?: pulumi.Input<pulumi.Input<inputs.CloudProject.GatewayInterface>[]>;
    /**
     * Model of the gateway.
     */
    model?: pulumi.Input<string>;
    /**
     * Name of the gateway.
     */
    name?: pulumi.Input<string>;
    /**
     * ID of the private network.
     */
    networkId?: pulumi.Input<string>;
    /**
     * Region of the gateway.
     */
    region?: pulumi.Input<string>;
    /**
     * ID of the private network.
     */
    serviceName?: pulumi.Input<string>;
    /**
     * Status of the gateway.
     */
    status?: pulumi.Input<string>;
    /**
     * ID of the subnet.
     */
    subnetId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Gateway resource.
 */
export interface GatewayArgs {
    /**
     * Model of the gateway.
     */
    model: pulumi.Input<string>;
    /**
     * Name of the gateway.
     */
    name?: pulumi.Input<string>;
    /**
     * ID of the private network.
     */
    networkId: pulumi.Input<string>;
    /**
     * Region of the gateway.
     */
    region: pulumi.Input<string>;
    /**
     * ID of the private network.
     */
    serviceName: pulumi.Input<string>;
    /**
     * ID of the subnet.
     */
    subnetId: pulumi.Input<string>;
}