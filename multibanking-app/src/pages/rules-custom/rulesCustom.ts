import { Component } from '@angular/core';
import { NavController, NavParams } from 'ionic-angular';
import { RulesService } from '../../services/RulesService';
import { Rule } from '../../api/Rule';
import { RuleEditPage } from '../rule-edit/ruleEdit';

@Component({
  selector: 'page-rules-custom',
  templateUrl: 'rulesCustom.html',
})
export class RulesCustomPage {

  selectedRule: Rule;

  rules: Rule[];

  constructor(public navCtrl: NavController,
    public navParams: NavParams,
    public rulesService: RulesService) {

    rulesService.rulesChangedObservable.subscribe(rule => {
      if (!rule.released) {
        this.loadRules();
      }
    })
  }

  ngOnInit() {
    this.loadRules();
  }

  loadRules() {
    this.rulesService.getRules(true).subscribe(rules => {
      this.rules = rules;
    })
  }

  releaseRule(rule: Rule) {
    rule.released = true;
    this.rulesService.updateRule(rule).subscribe(rules => {
      this.loadRules();
    })
  }

  createRule() {
    this.navCtrl.push(RuleEditPage, { rule: {} });
  }

  editRule(rule: Rule) {
    this.navCtrl.push(RuleEditPage, { rule: rule });
  }

  deleteRule(rule: Rule) {
    this.rulesService.deleteRule(rule.id, true).subscribe(rules => {
      this.loadRules();
    })
  }

}
