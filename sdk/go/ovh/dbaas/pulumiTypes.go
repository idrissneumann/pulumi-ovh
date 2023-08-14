// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dbaas

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type LogsInputConfiguration struct {
	// Flowgger configuration
	Flowgger *LogsInputConfigurationFlowgger `pulumi:"flowgger"`
	// Logstash configuration
	Logstash *LogsInputConfigurationLogstash `pulumi:"logstash"`
}

// LogsInputConfigurationInput is an input type that accepts LogsInputConfigurationArgs and LogsInputConfigurationOutput values.
// You can construct a concrete instance of `LogsInputConfigurationInput` via:
//
//	LogsInputConfigurationArgs{...}
type LogsInputConfigurationInput interface {
	pulumi.Input

	ToLogsInputConfigurationOutput() LogsInputConfigurationOutput
	ToLogsInputConfigurationOutputWithContext(context.Context) LogsInputConfigurationOutput
}

type LogsInputConfigurationArgs struct {
	// Flowgger configuration
	Flowgger LogsInputConfigurationFlowggerPtrInput `pulumi:"flowgger"`
	// Logstash configuration
	Logstash LogsInputConfigurationLogstashPtrInput `pulumi:"logstash"`
}

func (LogsInputConfigurationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LogsInputConfiguration)(nil)).Elem()
}

func (i LogsInputConfigurationArgs) ToLogsInputConfigurationOutput() LogsInputConfigurationOutput {
	return i.ToLogsInputConfigurationOutputWithContext(context.Background())
}

func (i LogsInputConfigurationArgs) ToLogsInputConfigurationOutputWithContext(ctx context.Context) LogsInputConfigurationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LogsInputConfigurationOutput)
}

func (i LogsInputConfigurationArgs) ToLogsInputConfigurationPtrOutput() LogsInputConfigurationPtrOutput {
	return i.ToLogsInputConfigurationPtrOutputWithContext(context.Background())
}

func (i LogsInputConfigurationArgs) ToLogsInputConfigurationPtrOutputWithContext(ctx context.Context) LogsInputConfigurationPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LogsInputConfigurationOutput).ToLogsInputConfigurationPtrOutputWithContext(ctx)
}

// LogsInputConfigurationPtrInput is an input type that accepts LogsInputConfigurationArgs, LogsInputConfigurationPtr and LogsInputConfigurationPtrOutput values.
// You can construct a concrete instance of `LogsInputConfigurationPtrInput` via:
//
//	        LogsInputConfigurationArgs{...}
//
//	or:
//
//	        nil
type LogsInputConfigurationPtrInput interface {
	pulumi.Input

	ToLogsInputConfigurationPtrOutput() LogsInputConfigurationPtrOutput
	ToLogsInputConfigurationPtrOutputWithContext(context.Context) LogsInputConfigurationPtrOutput
}

type logsInputConfigurationPtrType LogsInputConfigurationArgs

func LogsInputConfigurationPtr(v *LogsInputConfigurationArgs) LogsInputConfigurationPtrInput {
	return (*logsInputConfigurationPtrType)(v)
}

func (*logsInputConfigurationPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**LogsInputConfiguration)(nil)).Elem()
}

func (i *logsInputConfigurationPtrType) ToLogsInputConfigurationPtrOutput() LogsInputConfigurationPtrOutput {
	return i.ToLogsInputConfigurationPtrOutputWithContext(context.Background())
}

func (i *logsInputConfigurationPtrType) ToLogsInputConfigurationPtrOutputWithContext(ctx context.Context) LogsInputConfigurationPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LogsInputConfigurationPtrOutput)
}

type LogsInputConfigurationOutput struct{ *pulumi.OutputState }

func (LogsInputConfigurationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LogsInputConfiguration)(nil)).Elem()
}

func (o LogsInputConfigurationOutput) ToLogsInputConfigurationOutput() LogsInputConfigurationOutput {
	return o
}

func (o LogsInputConfigurationOutput) ToLogsInputConfigurationOutputWithContext(ctx context.Context) LogsInputConfigurationOutput {
	return o
}

func (o LogsInputConfigurationOutput) ToLogsInputConfigurationPtrOutput() LogsInputConfigurationPtrOutput {
	return o.ToLogsInputConfigurationPtrOutputWithContext(context.Background())
}

func (o LogsInputConfigurationOutput) ToLogsInputConfigurationPtrOutputWithContext(ctx context.Context) LogsInputConfigurationPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v LogsInputConfiguration) *LogsInputConfiguration {
		return &v
	}).(LogsInputConfigurationPtrOutput)
}

// Flowgger configuration
func (o LogsInputConfigurationOutput) Flowgger() LogsInputConfigurationFlowggerPtrOutput {
	return o.ApplyT(func(v LogsInputConfiguration) *LogsInputConfigurationFlowgger { return v.Flowgger }).(LogsInputConfigurationFlowggerPtrOutput)
}

// Logstash configuration
func (o LogsInputConfigurationOutput) Logstash() LogsInputConfigurationLogstashPtrOutput {
	return o.ApplyT(func(v LogsInputConfiguration) *LogsInputConfigurationLogstash { return v.Logstash }).(LogsInputConfigurationLogstashPtrOutput)
}

type LogsInputConfigurationPtrOutput struct{ *pulumi.OutputState }

func (LogsInputConfigurationPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**LogsInputConfiguration)(nil)).Elem()
}

func (o LogsInputConfigurationPtrOutput) ToLogsInputConfigurationPtrOutput() LogsInputConfigurationPtrOutput {
	return o
}

func (o LogsInputConfigurationPtrOutput) ToLogsInputConfigurationPtrOutputWithContext(ctx context.Context) LogsInputConfigurationPtrOutput {
	return o
}

func (o LogsInputConfigurationPtrOutput) Elem() LogsInputConfigurationOutput {
	return o.ApplyT(func(v *LogsInputConfiguration) LogsInputConfiguration {
		if v != nil {
			return *v
		}
		var ret LogsInputConfiguration
		return ret
	}).(LogsInputConfigurationOutput)
}

// Flowgger configuration
func (o LogsInputConfigurationPtrOutput) Flowgger() LogsInputConfigurationFlowggerPtrOutput {
	return o.ApplyT(func(v *LogsInputConfiguration) *LogsInputConfigurationFlowgger {
		if v == nil {
			return nil
		}
		return v.Flowgger
	}).(LogsInputConfigurationFlowggerPtrOutput)
}

// Logstash configuration
func (o LogsInputConfigurationPtrOutput) Logstash() LogsInputConfigurationLogstashPtrOutput {
	return o.ApplyT(func(v *LogsInputConfiguration) *LogsInputConfigurationLogstash {
		if v == nil {
			return nil
		}
		return v.Logstash
	}).(LogsInputConfigurationLogstashPtrOutput)
}

type LogsInputConfigurationFlowgger struct {
	// Type of format to decode. One of "RFC5424", "LTSV", "GELF", "CAPNP"
	LogFormat string `pulumi:"logFormat"`
	// Indicates how messages are delimited. One of "LINE", "NUL", "SYSLEN", "CAPNP"
	LogFraming string `pulumi:"logFraming"`
}

// LogsInputConfigurationFlowggerInput is an input type that accepts LogsInputConfigurationFlowggerArgs and LogsInputConfigurationFlowggerOutput values.
// You can construct a concrete instance of `LogsInputConfigurationFlowggerInput` via:
//
//	LogsInputConfigurationFlowggerArgs{...}
type LogsInputConfigurationFlowggerInput interface {
	pulumi.Input

	ToLogsInputConfigurationFlowggerOutput() LogsInputConfigurationFlowggerOutput
	ToLogsInputConfigurationFlowggerOutputWithContext(context.Context) LogsInputConfigurationFlowggerOutput
}

type LogsInputConfigurationFlowggerArgs struct {
	// Type of format to decode. One of "RFC5424", "LTSV", "GELF", "CAPNP"
	LogFormat pulumi.StringInput `pulumi:"logFormat"`
	// Indicates how messages are delimited. One of "LINE", "NUL", "SYSLEN", "CAPNP"
	LogFraming pulumi.StringInput `pulumi:"logFraming"`
}

func (LogsInputConfigurationFlowggerArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LogsInputConfigurationFlowgger)(nil)).Elem()
}

func (i LogsInputConfigurationFlowggerArgs) ToLogsInputConfigurationFlowggerOutput() LogsInputConfigurationFlowggerOutput {
	return i.ToLogsInputConfigurationFlowggerOutputWithContext(context.Background())
}

func (i LogsInputConfigurationFlowggerArgs) ToLogsInputConfigurationFlowggerOutputWithContext(ctx context.Context) LogsInputConfigurationFlowggerOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LogsInputConfigurationFlowggerOutput)
}

func (i LogsInputConfigurationFlowggerArgs) ToLogsInputConfigurationFlowggerPtrOutput() LogsInputConfigurationFlowggerPtrOutput {
	return i.ToLogsInputConfigurationFlowggerPtrOutputWithContext(context.Background())
}

func (i LogsInputConfigurationFlowggerArgs) ToLogsInputConfigurationFlowggerPtrOutputWithContext(ctx context.Context) LogsInputConfigurationFlowggerPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LogsInputConfigurationFlowggerOutput).ToLogsInputConfigurationFlowggerPtrOutputWithContext(ctx)
}

// LogsInputConfigurationFlowggerPtrInput is an input type that accepts LogsInputConfigurationFlowggerArgs, LogsInputConfigurationFlowggerPtr and LogsInputConfigurationFlowggerPtrOutput values.
// You can construct a concrete instance of `LogsInputConfigurationFlowggerPtrInput` via:
//
//	        LogsInputConfigurationFlowggerArgs{...}
//
//	or:
//
//	        nil
type LogsInputConfigurationFlowggerPtrInput interface {
	pulumi.Input

	ToLogsInputConfigurationFlowggerPtrOutput() LogsInputConfigurationFlowggerPtrOutput
	ToLogsInputConfigurationFlowggerPtrOutputWithContext(context.Context) LogsInputConfigurationFlowggerPtrOutput
}

type logsInputConfigurationFlowggerPtrType LogsInputConfigurationFlowggerArgs

func LogsInputConfigurationFlowggerPtr(v *LogsInputConfigurationFlowggerArgs) LogsInputConfigurationFlowggerPtrInput {
	return (*logsInputConfigurationFlowggerPtrType)(v)
}

func (*logsInputConfigurationFlowggerPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**LogsInputConfigurationFlowgger)(nil)).Elem()
}

func (i *logsInputConfigurationFlowggerPtrType) ToLogsInputConfigurationFlowggerPtrOutput() LogsInputConfigurationFlowggerPtrOutput {
	return i.ToLogsInputConfigurationFlowggerPtrOutputWithContext(context.Background())
}

func (i *logsInputConfigurationFlowggerPtrType) ToLogsInputConfigurationFlowggerPtrOutputWithContext(ctx context.Context) LogsInputConfigurationFlowggerPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LogsInputConfigurationFlowggerPtrOutput)
}

type LogsInputConfigurationFlowggerOutput struct{ *pulumi.OutputState }

func (LogsInputConfigurationFlowggerOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LogsInputConfigurationFlowgger)(nil)).Elem()
}

func (o LogsInputConfigurationFlowggerOutput) ToLogsInputConfigurationFlowggerOutput() LogsInputConfigurationFlowggerOutput {
	return o
}

func (o LogsInputConfigurationFlowggerOutput) ToLogsInputConfigurationFlowggerOutputWithContext(ctx context.Context) LogsInputConfigurationFlowggerOutput {
	return o
}

func (o LogsInputConfigurationFlowggerOutput) ToLogsInputConfigurationFlowggerPtrOutput() LogsInputConfigurationFlowggerPtrOutput {
	return o.ToLogsInputConfigurationFlowggerPtrOutputWithContext(context.Background())
}

func (o LogsInputConfigurationFlowggerOutput) ToLogsInputConfigurationFlowggerPtrOutputWithContext(ctx context.Context) LogsInputConfigurationFlowggerPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v LogsInputConfigurationFlowgger) *LogsInputConfigurationFlowgger {
		return &v
	}).(LogsInputConfigurationFlowggerPtrOutput)
}

// Type of format to decode. One of "RFC5424", "LTSV", "GELF", "CAPNP"
func (o LogsInputConfigurationFlowggerOutput) LogFormat() pulumi.StringOutput {
	return o.ApplyT(func(v LogsInputConfigurationFlowgger) string { return v.LogFormat }).(pulumi.StringOutput)
}

// Indicates how messages are delimited. One of "LINE", "NUL", "SYSLEN", "CAPNP"
func (o LogsInputConfigurationFlowggerOutput) LogFraming() pulumi.StringOutput {
	return o.ApplyT(func(v LogsInputConfigurationFlowgger) string { return v.LogFraming }).(pulumi.StringOutput)
}

type LogsInputConfigurationFlowggerPtrOutput struct{ *pulumi.OutputState }

func (LogsInputConfigurationFlowggerPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**LogsInputConfigurationFlowgger)(nil)).Elem()
}

func (o LogsInputConfigurationFlowggerPtrOutput) ToLogsInputConfigurationFlowggerPtrOutput() LogsInputConfigurationFlowggerPtrOutput {
	return o
}

func (o LogsInputConfigurationFlowggerPtrOutput) ToLogsInputConfigurationFlowggerPtrOutputWithContext(ctx context.Context) LogsInputConfigurationFlowggerPtrOutput {
	return o
}

func (o LogsInputConfigurationFlowggerPtrOutput) Elem() LogsInputConfigurationFlowggerOutput {
	return o.ApplyT(func(v *LogsInputConfigurationFlowgger) LogsInputConfigurationFlowgger {
		if v != nil {
			return *v
		}
		var ret LogsInputConfigurationFlowgger
		return ret
	}).(LogsInputConfigurationFlowggerOutput)
}

// Type of format to decode. One of "RFC5424", "LTSV", "GELF", "CAPNP"
func (o LogsInputConfigurationFlowggerPtrOutput) LogFormat() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *LogsInputConfigurationFlowgger) *string {
		if v == nil {
			return nil
		}
		return &v.LogFormat
	}).(pulumi.StringPtrOutput)
}

// Indicates how messages are delimited. One of "LINE", "NUL", "SYSLEN", "CAPNP"
func (o LogsInputConfigurationFlowggerPtrOutput) LogFraming() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *LogsInputConfigurationFlowgger) *string {
		if v == nil {
			return nil
		}
		return &v.LogFraming
	}).(pulumi.StringPtrOutput)
}

type LogsInputConfigurationLogstash struct {
	// The filter section of logstash.conf
	FilterSection *string `pulumi:"filterSection"`
	// The filter section of logstash.conf
	InputSection string `pulumi:"inputSection"`
	// The list of customs Grok patterns
	PatternSection *string `pulumi:"patternSection"`
}

// LogsInputConfigurationLogstashInput is an input type that accepts LogsInputConfigurationLogstashArgs and LogsInputConfigurationLogstashOutput values.
// You can construct a concrete instance of `LogsInputConfigurationLogstashInput` via:
//
//	LogsInputConfigurationLogstashArgs{...}
type LogsInputConfigurationLogstashInput interface {
	pulumi.Input

	ToLogsInputConfigurationLogstashOutput() LogsInputConfigurationLogstashOutput
	ToLogsInputConfigurationLogstashOutputWithContext(context.Context) LogsInputConfigurationLogstashOutput
}

type LogsInputConfigurationLogstashArgs struct {
	// The filter section of logstash.conf
	FilterSection pulumi.StringPtrInput `pulumi:"filterSection"`
	// The filter section of logstash.conf
	InputSection pulumi.StringInput `pulumi:"inputSection"`
	// The list of customs Grok patterns
	PatternSection pulumi.StringPtrInput `pulumi:"patternSection"`
}

func (LogsInputConfigurationLogstashArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LogsInputConfigurationLogstash)(nil)).Elem()
}

func (i LogsInputConfigurationLogstashArgs) ToLogsInputConfigurationLogstashOutput() LogsInputConfigurationLogstashOutput {
	return i.ToLogsInputConfigurationLogstashOutputWithContext(context.Background())
}

func (i LogsInputConfigurationLogstashArgs) ToLogsInputConfigurationLogstashOutputWithContext(ctx context.Context) LogsInputConfigurationLogstashOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LogsInputConfigurationLogstashOutput)
}

func (i LogsInputConfigurationLogstashArgs) ToLogsInputConfigurationLogstashPtrOutput() LogsInputConfigurationLogstashPtrOutput {
	return i.ToLogsInputConfigurationLogstashPtrOutputWithContext(context.Background())
}

func (i LogsInputConfigurationLogstashArgs) ToLogsInputConfigurationLogstashPtrOutputWithContext(ctx context.Context) LogsInputConfigurationLogstashPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LogsInputConfigurationLogstashOutput).ToLogsInputConfigurationLogstashPtrOutputWithContext(ctx)
}

// LogsInputConfigurationLogstashPtrInput is an input type that accepts LogsInputConfigurationLogstashArgs, LogsInputConfigurationLogstashPtr and LogsInputConfigurationLogstashPtrOutput values.
// You can construct a concrete instance of `LogsInputConfigurationLogstashPtrInput` via:
//
//	        LogsInputConfigurationLogstashArgs{...}
//
//	or:
//
//	        nil
type LogsInputConfigurationLogstashPtrInput interface {
	pulumi.Input

	ToLogsInputConfigurationLogstashPtrOutput() LogsInputConfigurationLogstashPtrOutput
	ToLogsInputConfigurationLogstashPtrOutputWithContext(context.Context) LogsInputConfigurationLogstashPtrOutput
}

type logsInputConfigurationLogstashPtrType LogsInputConfigurationLogstashArgs

func LogsInputConfigurationLogstashPtr(v *LogsInputConfigurationLogstashArgs) LogsInputConfigurationLogstashPtrInput {
	return (*logsInputConfigurationLogstashPtrType)(v)
}

func (*logsInputConfigurationLogstashPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**LogsInputConfigurationLogstash)(nil)).Elem()
}

func (i *logsInputConfigurationLogstashPtrType) ToLogsInputConfigurationLogstashPtrOutput() LogsInputConfigurationLogstashPtrOutput {
	return i.ToLogsInputConfigurationLogstashPtrOutputWithContext(context.Background())
}

func (i *logsInputConfigurationLogstashPtrType) ToLogsInputConfigurationLogstashPtrOutputWithContext(ctx context.Context) LogsInputConfigurationLogstashPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LogsInputConfigurationLogstashPtrOutput)
}

type LogsInputConfigurationLogstashOutput struct{ *pulumi.OutputState }

func (LogsInputConfigurationLogstashOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LogsInputConfigurationLogstash)(nil)).Elem()
}

func (o LogsInputConfigurationLogstashOutput) ToLogsInputConfigurationLogstashOutput() LogsInputConfigurationLogstashOutput {
	return o
}

func (o LogsInputConfigurationLogstashOutput) ToLogsInputConfigurationLogstashOutputWithContext(ctx context.Context) LogsInputConfigurationLogstashOutput {
	return o
}

func (o LogsInputConfigurationLogstashOutput) ToLogsInputConfigurationLogstashPtrOutput() LogsInputConfigurationLogstashPtrOutput {
	return o.ToLogsInputConfigurationLogstashPtrOutputWithContext(context.Background())
}

func (o LogsInputConfigurationLogstashOutput) ToLogsInputConfigurationLogstashPtrOutputWithContext(ctx context.Context) LogsInputConfigurationLogstashPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v LogsInputConfigurationLogstash) *LogsInputConfigurationLogstash {
		return &v
	}).(LogsInputConfigurationLogstashPtrOutput)
}

// The filter section of logstash.conf
func (o LogsInputConfigurationLogstashOutput) FilterSection() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LogsInputConfigurationLogstash) *string { return v.FilterSection }).(pulumi.StringPtrOutput)
}

// The filter section of logstash.conf
func (o LogsInputConfigurationLogstashOutput) InputSection() pulumi.StringOutput {
	return o.ApplyT(func(v LogsInputConfigurationLogstash) string { return v.InputSection }).(pulumi.StringOutput)
}

// The list of customs Grok patterns
func (o LogsInputConfigurationLogstashOutput) PatternSection() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LogsInputConfigurationLogstash) *string { return v.PatternSection }).(pulumi.StringPtrOutput)
}

type LogsInputConfigurationLogstashPtrOutput struct{ *pulumi.OutputState }

func (LogsInputConfigurationLogstashPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**LogsInputConfigurationLogstash)(nil)).Elem()
}

func (o LogsInputConfigurationLogstashPtrOutput) ToLogsInputConfigurationLogstashPtrOutput() LogsInputConfigurationLogstashPtrOutput {
	return o
}

func (o LogsInputConfigurationLogstashPtrOutput) ToLogsInputConfigurationLogstashPtrOutputWithContext(ctx context.Context) LogsInputConfigurationLogstashPtrOutput {
	return o
}

func (o LogsInputConfigurationLogstashPtrOutput) Elem() LogsInputConfigurationLogstashOutput {
	return o.ApplyT(func(v *LogsInputConfigurationLogstash) LogsInputConfigurationLogstash {
		if v != nil {
			return *v
		}
		var ret LogsInputConfigurationLogstash
		return ret
	}).(LogsInputConfigurationLogstashOutput)
}

// The filter section of logstash.conf
func (o LogsInputConfigurationLogstashPtrOutput) FilterSection() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *LogsInputConfigurationLogstash) *string {
		if v == nil {
			return nil
		}
		return v.FilterSection
	}).(pulumi.StringPtrOutput)
}

// The filter section of logstash.conf
func (o LogsInputConfigurationLogstashPtrOutput) InputSection() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *LogsInputConfigurationLogstash) *string {
		if v == nil {
			return nil
		}
		return &v.InputSection
	}).(pulumi.StringPtrOutput)
}

// The list of customs Grok patterns
func (o LogsInputConfigurationLogstashPtrOutput) PatternSection() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *LogsInputConfigurationLogstash) *string {
		if v == nil {
			return nil
		}
		return v.PatternSection
	}).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*LogsInputConfigurationInput)(nil)).Elem(), LogsInputConfigurationArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*LogsInputConfigurationPtrInput)(nil)).Elem(), LogsInputConfigurationArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*LogsInputConfigurationFlowggerInput)(nil)).Elem(), LogsInputConfigurationFlowggerArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*LogsInputConfigurationFlowggerPtrInput)(nil)).Elem(), LogsInputConfigurationFlowggerArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*LogsInputConfigurationLogstashInput)(nil)).Elem(), LogsInputConfigurationLogstashArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*LogsInputConfigurationLogstashPtrInput)(nil)).Elem(), LogsInputConfigurationLogstashArgs{})
	pulumi.RegisterOutputType(LogsInputConfigurationOutput{})
	pulumi.RegisterOutputType(LogsInputConfigurationPtrOutput{})
	pulumi.RegisterOutputType(LogsInputConfigurationFlowggerOutput{})
	pulumi.RegisterOutputType(LogsInputConfigurationFlowggerPtrOutput{})
	pulumi.RegisterOutputType(LogsInputConfigurationLogstashOutput{})
	pulumi.RegisterOutputType(LogsInputConfigurationLogstashPtrOutput{})
}