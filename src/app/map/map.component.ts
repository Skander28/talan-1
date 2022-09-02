import { Component, OnInit } from '@angular/core';
import { FormBuilder,FormControl,FormGroup,Validators} from '@angular/forms';
import { ApiserviceService } from '../apiservice.service';
import { Mapping } from '../model/map.model';
@Component({
  selector: 'app-map',
  templateUrl: './map.component.html',
  styleUrls: ['./map.component.css']
})
export class MapComponent implements OnInit {

  myForm!: FormGroup;
  formGroup! : FormGroup;
  

 /*  mapping: Mapping = {
    generateur: '',
    fichier: '',
    delimiteur: '',
    lignesAignorer: '',
    Informatica: '',
    source: '',
    destination: '',
    tablederejet: '',
    masquefichier: '',
    masquejava: '',
    masqueinfo: '',
    SchemaInput: '',
    ajouter: '',

  }; */
  submitted = false;
  

  constructor(private fb: FormBuilder, private service:ApiserviceService ) {
    
   }

  ngOnInit(): void {
    
    this.myForm = this.fb.group({
      generateur:['',[
        Validators.required,
        Validators.maxLength(20)
      ]],
      fichier:['',[
        Validators.required,
        Validators.maxLength(4)
      ]],
      delimiteur:['',[
        Validators.required,
        Validators.maxLength(20)
      ]],
      lignesAignorer:['',[
        Validators.required,
        Validators.maxLength(20)
      ]],
      informatica:['',[
        Validators.required,
        Validators.maxLength(20)
      ]],
      source:['',[
        Validators.required,
        Validators.maxLength(20)
      ]],
      destination:['',[
        Validators.required,
        Validators.maxLength(20)
      ]],
      tablederejet:['REJET',[
        Validators.required,
        Validators.maxLength(20)
      ]],
      masquefichier:['YYYYMMDD-hhmmss',[
        Validators.required,
        Validators.maxLength(20),
      ]],
      masquejava:['mm/dd/yyyy hh24:mi:ss',[
        Validators.required,
        Validators.maxLength(22),
      ]],
      masqueinfo:['YYYYMMDD',[
        Validators.required,
        Validators.maxLength(22),
      ]],
      schemaInput:['',[
        Validators.required,
        Validators.maxLength(100),
      ]],
      ajouter: new FormControl()
    })

    this.myForm.valueChanges.subscribe(console.log)
  
  }

  get f() { return this.myForm.controls; }

  
   /*  const data = {
      generateur: this.mapping.generateur,
      fichier: this.mapping.fichier,
      delimiteur: this.mapping.delimiteur,
      lignesAignorer: this.mapping.lignesAignorer,
      Informatica: this.mapping.Informatica,
      source: this.mapping.source,
      destination: this.mapping.destination,
      tablederejet: this.mapping.tablederejet,
      masquefichier: this.mapping.masquefichier,
      masqueinfo: this.mapping.masqueinfo,
      masquejava: this.mapping.masquejava,
      SchemaInput: this.mapping.SchemaInput,
      ajouter: this.mapping.ajouter,
    }; */
  public saveData() {


    this.service.create(this.myForm.value)
      .subscribe(
        response => {
          console.log(response);
          this.submitted = true;

          this.service.generatexml(response)
        },
        error => {
          console.log(error);
        });
  }
  
  
}
